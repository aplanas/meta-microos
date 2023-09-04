SUMMARY = "Assistive Technology Service Provider Interface - D-Bus based implementation"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package contains the AT-SPI registry daemon. It provides a \
mechanism for all assistive technologies to discover and interact \
with applications running on the desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "at-spi2-core-2.48.3-2.1.aarch64.rpm"
RPM_HASH = "2674e6b993c08886136396a71b8c8c772702f65a483b424f54988213d1ba57dee3cdf995348b4220e687720ba03391682056c06bb928936f42df087305eae865"

RPROVIDES:${PN} += "at-spi2-atk-gtk2 \
at-spi2-core \
libatk-bridge.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libatk-bridge-2.0.so.0 \
libatspi.so.0 \
libc.so.6 \
libdbus-1.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0"

inherit rpm
