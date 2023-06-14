SUMMARY = "Lua Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Lua language."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-lua-3.8-1.1.aarch64.rpm"
RPM_HASH = "795e9e7fc00b7b243ddaf719926f11e2da35c068f2117bf4635cd4b36e7e4a99a30c2da1d9c80ccf911f11cd61dc7c4aff0de107dd1dce2f816886287af2ae14"

RPROVIDES:${PN} += "weechat-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
weechat"

inherit rpm
