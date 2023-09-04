SUMMARY = "Lua Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Lua language."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.2"

RPM_NAME = "weechat-lua-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "c88df06ca37b1289f90e5f8f7d7eba61220e796fc53d2992ac932c02b6212f9a29c4201d6f7ede82abe4e33188abcd975a3bb40e9d1314546efc919d6565b3f5"

RPROVIDES:${PN} += "weechat-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
weechat"

inherit rpm
