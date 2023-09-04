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

RPM_NAME = "perl-Digest-SHA1-2.13-19.39.aarch64.rpm"
RPM_HASH = "ef40610467d537c8109202583c8e4b0215e39a144864d69302e3a5b7e7f2f8ddbe3441e68b3782b60ca6ded36d1d4a96c53b61435fa3de7ca5ed163db80f4dc0"

RPROVIDES:${PN} += "perl-Digest--SHA1 \
perl-Digest-SHA1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
