SUMMARY = "Lua bindings to dbus"
DESCRIPTION = "ldbus is a C binding to dbus for Lua."
LICENSE = "MIT"

PV = "0.0+git20190816.9e176fe"

RPM_NAME = "lua53-ldbus-0.0+git20190816.9e176fe-4.2.aarch64.rpm"
RPM_HASH = "4cff1c4c61eab1a2b155ec3ab7d22c32f331439b186df89e4462c20ef018842f8b210e74f88e6a96cb4a690e77c3406d69c0e9d38553cc602300c452715581ec"

RPROVIDES:${PN} += "lua53-ldbus"

RDEPENDS:${PN} += "libc.so.6 \
libdbus-1.so.3 \
lua53"

inherit rpm
