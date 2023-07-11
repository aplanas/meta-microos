SUMMARY = "One Time Password library for Heimdal Kerberos"
DESCRIPTION = "This package contains the library for One Time Password support."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libotp0-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "c2e0bb412c680753f3d0a67f1b68289d9cf779cbd0c1390cff541c9fba981d4fae8fd0f1353fdd1c1143fa1c185abda50b058cb1f71e3772ff72876ec342595e"

RPROVIDES:${PN} += "libotp.so.0 \
libotp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libhcrypto.so.4"

inherit rpm
