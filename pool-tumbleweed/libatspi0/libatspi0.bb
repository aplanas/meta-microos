SUMMARY = "Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.4"

RPM_NAME = "libatspi0-2.48.4-1.1.aarch64.rpm"
RPM_HASH = "c016b9d93ef12e898d10188e88fa5bb818dd69246cc005e4cd04b31f3f580d9bd75a492fdfa3326bd33a835d5a6ea2becdad1241b541653b0af2867a1d184d20"

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
