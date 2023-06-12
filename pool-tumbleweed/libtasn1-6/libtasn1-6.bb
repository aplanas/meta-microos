SUMMARY = "ASN.1 parsing library"
DESCRIPTION = "This is the ASN.1 library used by GNUTLS. Abstract Syntax Notation One (ASN.1) \
is a standardized data description and serialization language."
LICENSE = "LGPL-2.1-or-later"

PV = "4.19.0"

RPM_NAME = "libtasn1-6-4.19.0-1.3.aarch64.rpm"
RPM_HASH = "045f4fe51cad819013afe21e95baf40a431f7d0ba12a072b01b6e723fc4a4332b811a4b145b4dd7da9c9994eb76bb234c89e06d9092808b25136b4e426452270"

RPROVIDES:${PN} += "libtasn1-6 \
libtasn1-6(aarch-64) \
libtasn1.so.6()(64bit) \
libtasn1.so.6(LIBTASN1_0_3)(64bit) \
libtasn1.so.6(LIBTASN1_4_16_0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
