SUMMARY = "SCrypt library"
DESCRIPTION = "This is a shared library that implements scrypt() functionality."
LICENSE = "BSD-1-Clause"

PV = "1.22"

RPM_NAME = "libscrypt0-1.22-1.2.aarch64.rpm"
RPM_HASH = "32c83df1814fdf9c4efc283edd7377ade4654e08d67f31de1edefaba5ae727b38b231fb78e9b092905e3127040bf7e07f827519822004a7ee4443817918b3038"

RPROVIDES:${PN} += "libscrypt.so.0 \
libscrypt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
