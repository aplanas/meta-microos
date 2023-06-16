SUMMARY = "Assistive Technology Service Provider Interface - D-Bus based implementation"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package contains the AT-SPI registry daemon. It provides a \
mechanism for all assistive technologies to discover and interact \
with applications running on the desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "at-spi2-core-2.48.3-1.1.aarch64.rpm"
RPM_HASH = "e1d673bfbd6212338bef2e5deb31ee1c85f1c4d1db5ea622b16068ba9a56a6a00298331957f034105b76273243970c45f1b88e16705ba2e2dcc0ffb9f877c71f"

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
