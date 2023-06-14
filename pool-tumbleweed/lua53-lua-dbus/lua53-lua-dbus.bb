SUMMARY = "Convenient dbus api for lua"
DESCRIPTION = "lua-dbus is a convenient lua api for dbus"
LICENSE = "MIT"

PV = "0.0+git20170818.8fe38d0"

RPM_NAME = "lua53-lua-dbus-0.0+git20170818.8fe38d0-5.1.aarch64.rpm"
RPM_HASH = "6adbb9cb6931e8674999eebd9cab79d98540cea6f53536dacd699e1a109e4d759d0d63e96a7910ec4828a1239e50379f4c21bdbdfe7fb52dbe0988fea9b6817d"

RPROVIDES:${PN} += "lua53-lua-dbus"

RDEPENDS:${PN} += "lua53 \
lua53-ldbus"

inherit rpm
