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

RPM_NAME = "perl-Digest-MD4-1.9-5.39.aarch64.rpm"
RPM_HASH = "0c6486b4996c3528c39f3c4ee36fce41ed35ddccc8533d66a8c890b6af962893857796deece10293b8b090100bc93dadc7087c0e1f5acf99133839e22df32a03"

RPROVIDES:${PN} += "perl-Digest--MD4 \
perl-Digest-MD4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
