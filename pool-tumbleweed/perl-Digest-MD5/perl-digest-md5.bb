SUMMARY = "Perl interface to the MD5 Algorithm"
DESCRIPTION = "The 'Digest::MD5' module allows you to use the RSA Data Security Inc. MD5 \
Message Digest algorithm from within Perl programs. The algorithm takes as \
input a message of arbitrary length and produces as output a 128-bit \
'fingerprint' or 'message digest' of the input. \
 \
Note that the MD5 algorithm is not as strong as it used to be. It has since \
2005 been easy to generate different messages that produce the same MD5 \
digest. It still seems hard to generate messages that produce a given \
digest, but it is probably wise to move to stronger algorithms for \
applications that depend on the digest to uniquely identify a message. \
 \
The 'Digest::MD5' module provide a procedural interface for simple use, as \
well as an object oriented interface that can handle messages of arbitrary \
length and which can read files directly."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.58"

RPM_NAME = "perl-Digest-MD5-2.58-1.15.aarch64.rpm"
RPM_HASH = "4078513f336d81339a52520fc24728e790b579c363bab4203827b56f9f5812f3b5ecfd1a47be21acc92eb664318ab6914cc6d9ea7f7eac47c75f5124b44c8ec3"

RPROVIDES:${PN} += "perl(Digest::MD5) \
perl-Digest-MD5 \
perl-Digest-MD5(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
