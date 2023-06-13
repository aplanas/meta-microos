SUMMARY = "Lua bindings to dbus"
DESCRIPTION = "ldbus is a C binding to dbus for Lua."
LICENSE = "MIT"

PV = "0.0+git20190816.9e176fe"

RPM_NAME = "lua54-ldbus-0.0+git20190816.9e176fe-4.2.aarch64.rpm"
RPM_HASH = "e3cb2636afc754ca143766ec79918445ec976d53fb85266bb5c502ca701be18af3d4ab283c2241722c15dc3fd9c15bb22203fd04439d439eaad343072297fcf2"

RPROVIDES:${PN} += "lua-ldbus \
lua54-ldbus \
lua54-ldbus(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
lua54"

inherit rpm
