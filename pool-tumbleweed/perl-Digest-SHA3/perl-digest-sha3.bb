SUMMARY = "Perl extension for SHA-3"
DESCRIPTION = "Digest::SHA3 is written in C for speed. If your platform lacks a C \
compiler, perhaps you can find the module in a binary form compatible with \
your particular processor and operating system. \
 \
The programming interface is easy to use: it's the same one found in CPAN's \
Digest module. So, if your applications currently use Digest::SHA and you'd \
prefer the newer flavor of the NIST standard, it's a simple matter to \
convert them. \
 \
The interface provides two ways to calculate digests: all-at-once, or in \
stages. To illustrate, the following short program computes the SHA3-256 \
digest of 'hello world' using each approach: \
 \
	use Digest::SHA3 qw(sha3_256_hex); \
 \
	$data = 'hello world'; \
	@frags = split(//, $data); \
 \
	 \
	$digest1 = sha3_256_hex($data); \
 \
	 \
	$state = Digest::SHA3->new(256); \
	for (@frags) { $state->add($_) } \
	$digest2 = $state->hexdigest; \
 \
	print $digest1 eq $digest2 ? \
		'that's the ticket!\\n' : 'oops!\\n'; \
 \
To calculate the digest of an n-bit message where _n_ is not a multiple of \
8, use the _add_bits()_ method. For example, consider the 446-bit message \
consisting of the bit-string '110' repeated 148 times, followed by '11'. \
Here's how to display its SHA3-512 digest: \
 \
	use Digest::SHA3; \
	$bits = '110' x 148 . '11'; \
	$sha3 = Digest::SHA3->new(512)->add_bits($bits); \
	print $sha3->hexdigest, '\\n'; \
 \
Note that for larger bit-strings, it's more efficient to use the \
two-argument version _add_bits($data, $nbits)_, where _$data_ is in the \
customary packed binary format used for Perl strings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.05"

RPM_NAME = "perl-Digest-SHA3-1.05-1.4.aarch64.rpm"
RPM_HASH = "ebda1a21eb811b50b61e494ef0f15e3638613dfe81d68f243652cb36beed9da298646ed1ca042c3aebebfced3f27237cdeee68522d6e5136c7c17094713a728d"

RPROVIDES:${PN} += "perl-Digest--SHA3 \
perl-Digest-SHA3"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
