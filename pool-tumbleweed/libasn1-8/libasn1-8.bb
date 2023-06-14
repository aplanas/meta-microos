SUMMARY = "ASN.1 implementation from Heimdal Kerberos"
DESCRIPTION = "This package contains the ASN.1 parser required for Heimdal."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libasn1-8-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "002214c51a0ead89cb6c2544ae9da466fc9c29a9d689e1d77a8db11fabe347645b57b29a5df102a991c23c600fec19ef5ccafa63c472aca7c3a42c7ebb8f15a6"

RPROVIDES:${PN} += "libasn1-8 \
libasn1.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libroken.so.18"

inherit rpm
