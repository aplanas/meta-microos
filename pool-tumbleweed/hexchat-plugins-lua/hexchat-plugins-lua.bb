SUMMARY = "Plugin for HexChat adds support for LUA scripts"
DESCRIPTION = "The HexChat plugin providing the LUA scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-plugins-lua-2.16.1-2.8.aarch64.rpm"
RPM_HASH = "5f6a698ee4bfa8bf1f13bad51de59af58de0ad5dd233989dada040b7838259a45f9ab705d76a5220cce6e9cd861d093de5bcb370a34ba7dac1bc1d92a36daa1a"

RPROVIDES:${PN} += "hexchat-plugins-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
liblua5.4.so.5 \
lua"

inherit rpm
