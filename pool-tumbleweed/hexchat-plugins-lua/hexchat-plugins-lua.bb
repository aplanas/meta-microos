SUMMARY = "Plugin for HexChat adds support for LUA scripts"
DESCRIPTION = "The HexChat plugin providing the LUA scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-plugins-lua-2.16.1-2.7.aarch64.rpm"
RPM_HASH = "86d56672d7617edd6470ae22ddbaae8a57b369e490c0f73e9f0f21434e1330946c18020dafc0c6fade388e206bbeae6b620aebbdfede98c32d004a6cbac19e69"

RPROVIDES:${PN} += "hexchat-plugins-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
liblua5.4.so.5 \
lua"

inherit rpm
