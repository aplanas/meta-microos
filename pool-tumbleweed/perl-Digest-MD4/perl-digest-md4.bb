SUMMARY = "Perl interface to the MD4 Algorithm"
DESCRIPTION = "The 'Digest::MD4' module allows you to use the RSA Data Security Inc. MD4 \
Message Digest algorithm from within Perl programs. The algorithm takes as \
input a message of arbitrary length and produces as output a 128-bit \
'fingerprint' or 'message digest' of the input. \
 \
The 'Digest::MD4' module provides a procedural interface for simple use, as \
well as an object oriented interface that can handle messages of arbitrary \
length and which can read files directly."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.9"

RPM_NAME = "perl-Digest-MD4-1.9-5.38.aarch64.rpm"
RPM_HASH = "55c2102e76a0d76615265ced8af1bb6336de1454ab54655889b4d28056760fee1fa3fa1e2d5cfa090de38429dc11140ad5eecb832dc57db013932ddbabba7826"

RPROVIDES:${PN} += "perl-Digest--MD4 \
perl-Digest-MD4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
