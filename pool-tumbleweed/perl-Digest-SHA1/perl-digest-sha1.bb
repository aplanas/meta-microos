SUMMARY = "Perl Interface to the SHA-1 Algorithm"
DESCRIPTION = " \
 Digest-SHA1 module for perl \
  The Digest::SHA1 module allows the use of the NIST SHA-1 message digest \
  algorithm from within Perl programs. The algorithm takes a message of \
  arbitrary length as input and produces a 160-bit fingerprint or message \
  digest of the input as output. \
  Authors: \
		Peter C. Gutmann, \
		Uwe Hollerbach <uh@alumni.caltech.edu>, \
		Gisle Aas <gisle@aas.no>"
LICENSE = "Artistic-1.0"

PV = "2.13"

RPM_NAME = "perl-Digest-SHA1-2.13-19.37.aarch64.rpm"
RPM_HASH = "5558fa8232fed0f0a190991d54850d8f7bf9d0ceb791afbd0f1c6a0d3dc3db03b5a1996692b4d140905c0b91583b0a2e6328228c13495521543c4a49c3f1a4aa"

RPROVIDES:${PN} += "perl(Digest::SHA1) \
perl-Digest-SHA1 \
perl-Digest-SHA1(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
