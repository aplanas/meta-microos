SUMMARY = "GTK+-3.0 Hangul Input Modules"
DESCRIPTION = "GTK+-2.0 Hangul input modules."
LICENSE = "GPL-2.0+"

PV = "3.1.1+git20130112.a4c2796"

RPM_NAME = "imhangul-3.1.1+git20130112.a4c2796-2.26.aarch64.rpm"
RPM_HASH = "18f4889fc6a60532f5b79a2b6fa44905b25db0a1c3836da97586059899437abf0389ee55dbca84b4cfb3d3b917c657ca5d158b734bb64f4bf9511b7603469cc9"

RPROVIDES:${PN} += "imhangul \
locale-gtk3-ko"

RDEPENDS:${PN} += "/bin/sh \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhangul.so.1 \
libpango-1.0.so.0"

inherit rpm
