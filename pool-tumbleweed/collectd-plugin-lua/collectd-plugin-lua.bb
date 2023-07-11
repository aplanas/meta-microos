SUMMARY = "Lua API for collectd"
DESCRIPTION = "Optional collectd Lua API in order to write collectd plugins in Lua."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-lua-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "149f17ca7650d8f03fd742afd546054f03e5851c95838c20104af4b912c384ec46cf22b969bbe01eef7c6a957e608fa15d04617216d88b2d515e00148f0314e3"

RPROVIDES:${PN} += "collectd-plugin-lua"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
lua"

inherit rpm
