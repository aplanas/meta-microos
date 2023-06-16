SUMMARY = "IBus input method support for gtk4 applications"
DESCRIPTION = "This package contains ibus im module for use by gtk4."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-gtk4-1.5.28-2.1.aarch64.rpm"
RPM_HASH = "1931e6ec657b4ba939f07cb96fd5543dfbd6b8adfa7d555c32c2ebe3281235422347c4fbc073b348efdd291e09e7e8f55f8e6f26f8a6a2f85843d98052d8c8d4"

RPROVIDES:${PN} += "ibus-gtk4 \
libim-ibus.so"

RDEPENDS:${PN} += "/usr/bin/sh \
glib2-tools \
ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libibus-1.0.so.5 \
libpango-1.0.so.0"

inherit rpm
