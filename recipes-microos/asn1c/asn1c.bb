SUMMARY = "ASN.1 Compiler"
DESCRIPTION = "Compiles ASN.1 data structures into C source structures that can be \
simply marshalled to/unmarshalled from: BER, DER, CER, BASIC-XER, \
CXER, EXTENDED-XER, PER."
LICENSE = "BSD-2-Clause"

PV = "0.9.28"

RPM_NAME = "asn1c-0.9.28-2.13.aarch64.rpm"
RPM_HASH = "fe8a252476c3015355157a7d430d8e09097cfc55fe5ad08acae6ca3db1053c14a7bdcd2dda22b15a87ce7546cb70d51e8dad155137fb7dc08086101b2894bc74"

RPROVIDES:${PN} += "asn1c \
asn1c(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
