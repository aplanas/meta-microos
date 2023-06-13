SUMMARY = "Plugin for HexChat adds support for LUA scripts"
DESCRIPTION = "The HexChat plugin providing the LUA scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-plugins-lua-2.16.1-2.4.aarch64.rpm"
RPM_HASH = "857f892dd5456f1a6b05c67e73b0b56724a448a1ab3518121ee6ad9561121aa791afdc2483448b349599027e2d8f146f2de94a3a1284831dcaa9dd3b33187e6c"

RPROVIDES:${PN} += "hexchat-plugins-lua \
hexchat-plugins-lua(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
liblua5.4.so.5()(64bit) \
lua"

inherit rpm
