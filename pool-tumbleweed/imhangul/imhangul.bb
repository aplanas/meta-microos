SUMMARY = "GTK+-3.0 Hangul Input Modules"
DESCRIPTION = "GTK+-2.0 Hangul input modules."
LICENSE = "GPL-2.0+"

PV = "3.1.1+git20130112.a4c2796"

RPM_NAME = "imhangul-3.1.1+git20130112.a4c2796-2.27.aarch64.rpm"
RPM_HASH = "9e6e2e2f5e2d1b33789375365e3ec25ced4b67193d280c7649f8ac9fddaa3fe85c0bf5ae8d3c4b644839351676a063b0791a42fdee7becbfbce36321e9113131"

RPROVIDES:${PN} += "imhangul \
locale-gtk3-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhangul.so.1 \
libpango-1.0.so.0"

inherit rpm
