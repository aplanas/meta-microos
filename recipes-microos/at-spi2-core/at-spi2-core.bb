SUMMARY = "Assistive Technology Service Provider Interface - D-Bus based implementation"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package contains the AT-SPI registry daemon. It provides a \
mechanism for all assistive technologies to discover and interact \
with applications running on the desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.0"

RPM_NAME = "at-spi2-core-2.48.0-1.1.aarch64.rpm"
RPM_HASH = "789cc1c4bf18d4488eb0649cf4a72dd8c48d141fc4bb1e29bde315b6d1048e15acafd1567e43bdacd911dbfab8e6dbda49341cd91504c2341b04010babc43c16"

RPROVIDES:${PN} += "at-spi2-atk-gtk2 at-spi2-core at-spi2-core(aarch-64) libatk-bridge.so()(64bit)"
RDEPENDS:${PN} += "(xprop if xwayland) /bin/sh dbus-1 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXtst.so.6()(64bit) libatk-bridge-2.0.so.0()(64bit) libatspi.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
