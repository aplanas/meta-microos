SUMMARY = "Lua bindings to dbus"
DESCRIPTION = "ldbus is a C binding to dbus for Lua."
LICENSE = "MIT"

PV = "0.0+git20190816.9e176fe"

RPM_NAME = "lua51-ldbus-0.0+git20190816.9e176fe-4.2.aarch64.rpm"
RPM_HASH = "5b3e489ee163ce97d8e19779c1297c5a2144321243c736fb41a0d9636e6c156a68129615e5fa73b18c05aeb560d1611b183d508956350d28af3ea666b8aeee3c"

RPROVIDES:${PN} += "lua51-ldbus \
lua51-ldbus(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
lua51"

inherit rpm
