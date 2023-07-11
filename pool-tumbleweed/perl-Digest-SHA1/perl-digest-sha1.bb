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

RPM_NAME = "perl-Digest-SHA1-2.13-19.38.aarch64.rpm"
RPM_HASH = "9c0d32e0dc6495b1003034394511e316ead08cbcc4557f7d675d336816f17af66bdbf578a1bcd2a4ad8cca8ef3e42a4b7f0324a8db9ead606e95e82c056934fb"

RPROVIDES:${PN} += "perl-Digest--SHA1 \
perl-Digest-SHA1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
