SUMMARY = "Lua plugin for librime"
DESCRIPTION = "Lua plugin for librime."
LICENSE = "SUSE-Permissive"

PV = "0.0.0+git20211220.8b37d55"

RPM_NAME = "librime-lua-0.0.0+git20211220.8b37d55-2.10.aarch64.rpm"
RPM_HASH = "efa8fba50b5613bddb47d7806fb596129b808f247f7e2fa319b68d38772755b3f8980759862908af3330677a9d5f5e0b32b316d21872c76a768d67ced6714487"

RPROVIDES:${PN} += "librime-lua \
librime-lua.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglog.so.0 \
liblua5.4.so.5 \
libopencc.so.1.1 \
librime.so.1 \
libstdc++.so.6"

inherit rpm
