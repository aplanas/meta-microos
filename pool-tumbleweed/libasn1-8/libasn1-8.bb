SUMMARY = "ASN.1 implementation from Heimdal Kerberos"
DESCRIPTION = "This package contains the ASN.1 parser required for Heimdal."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libasn1-8-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "002214c51a0ead89cb6c2544ae9da466fc9c29a9d689e1d77a8db11fabe347645b57b29a5df102a991c23c600fec19ef5ccafa63c472aca7c3a42c7ebb8f15a6"

RPROVIDES:${PN} += "libasn1-8 \
libasn1-8(aarch-64) \
libasn1.so.8()(64bit) \
libasn1.so.8(HEIMDAL_ASN1_1.0)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcom_err.so.2()(64bit) \
libroken.so.18()(64bit) \
libroken.so.18(HEIMDAL_ROKEN_1.0)(64bit)"

inherit rpm
