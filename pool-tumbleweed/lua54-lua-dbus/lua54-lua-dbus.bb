SUMMARY = "Convenient dbus api for lua"
DESCRIPTION = "lua-dbus is a convenient lua api for dbus"
LICENSE = "MIT"

PV = "0.0+git20170818.8fe38d0"

RPM_NAME = "lua54-lua-dbus-0.0+git20170818.8fe38d0-5.1.aarch64.rpm"
RPM_HASH = "86be3d8bfab3fa0802c00e8d01aa9e8a0512330dd903365038dfe944eff6e6ad9b2cdf39af1e78825e4f91447fe82f8d195176b0e05244de8bf493c42361c78e"

RPROVIDES:${PN} += "lua-lua-dbus \
lua54-lua-dbus \
lua54-lua-dbus(aarch-64)"

RDEPENDS:${PN} += "lua54 \
lua54-ldbus"

inherit rpm
