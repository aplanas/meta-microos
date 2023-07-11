SUMMARY = "Lua Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Lua language."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-lua-3.8-1.3.aarch64.rpm"
RPM_HASH = "f3e721f6cd52a242937e8c53b5bb01e7e8cc025f65f3f87567b401a1c8732d7b98d26da80bdc3307bcf3e9c1f297009a277c4e9854b11d843efc53afbc4c1dd8"

RPROVIDES:${PN} += "weechat-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
weechat"

inherit rpm
