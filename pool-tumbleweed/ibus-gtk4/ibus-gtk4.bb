SUMMARY = "IBus input method support for gtk4 applications"
DESCRIPTION = "This package contains ibus im module for use by gtk4."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-gtk4-1.5.28-2.1.aarch64.rpm"
RPM_HASH = "1931e6ec657b4ba939f07cb96fd5543dfbd6b8adfa7d555c32c2ebe3281235422347c4fbc073b348efdd291e09e7e8f55f8e6f26f8a6a2f85843d98052d8c8d4"

RPROVIDES:${PN} += "ibus-gtk4 \
ibus-gtk4(aarch-64) \
libim-ibus.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
glib2-tools \
ibus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libibus-1.0.so.5()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
