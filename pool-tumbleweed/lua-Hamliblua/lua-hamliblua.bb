SUMMARY = "LUA bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "lua-Hamliblua-4.5.5-2.2.aarch64.rpm"
RPM_HASH = "534b70557be75d85313cf0d9d20367f1ffbe47e719638d38c8fa9bba589622a8bd1494cf0e656caebea81ff5cd93a40d7a3740642967cd6cd53e6436b3b871c0"

RPROVIDES:${PN} += "lua-Hamliblua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhamlib.so.4"

inherit rpm
