SUMMARY = "Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "libatspi0-2.48.3-2.1.aarch64.rpm"
RPM_HASH = "5b479412db55f1457e836e4ccbc573d2f9601441cbd5ed4fd0d9a9793afa06294690a8ad7363113fe502e7b26d6db6bb24ae13ba4c15fa5d41644e8feb09c0de"

RPROVIDES:${PN} += "libatspi.so.0 \
libatspi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
