SUMMARY = "ASN.1 Compiler"
DESCRIPTION = "Compiles ASN.1 data structures into C source structures that can be \
simply marshalled to/unmarshalled from: BER, DER, CER, BASIC-XER, \
CXER, EXTENDED-XER, PER."
LICENSE = "BSD-2-Clause"

PV = "0.9.28"

RPM_NAME = "asn1c-0.9.28-2.14.aarch64.rpm"
RPM_HASH = "f6a44804c9f67835bd1aa1781cf5ba34aa03b103d958d47f604a156b1e7ecdd62e28e32c113065b71e6cc1a8d48c4a681336a20b8ed118c2cf6b7259caa435ec"

RPROVIDES:${PN} += "asn1c"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
