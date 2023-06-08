SUMMARY = "L2TP plugin for connman"
DESCRIPTION = "Provides L2TP (Layer 2 Tunneling Protocol) support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-l2tp-1.41-4.7.aarch64.rpm"
RPM_HASH = "4e4e1f9285fb82ed3be419f4c7f7e1995fb6d37c43098f870520f9a7359968877c34afc41c08329cceaaed4e2ef9eb67422d25d3c3353d40931f77d4adb9d4a9"

RPROVIDES:${PN} += "connman-plugin-l2tp connman-plugin-l2tp(aarch-64) libppp-plugin.so()(64bit)"
RDEPENDS:${PN} += "connman ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit)"

inherit rpm
