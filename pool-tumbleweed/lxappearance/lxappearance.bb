SUMMARY = "It's a desktop-independent theme switcher for GTK+"
DESCRIPTION = "LXAppearance is part of LXDE project. \
It's a desktop-independent theme switcher for GTK+."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "lxappearance-0.6.3-1.14.aarch64.rpm"
RPM_HASH = "166954fbbc5ecc815ff2c0ea204afe8cd94a46e29af6e690a5b1d3a4dba523f2cc7b5bf219e8883753abd4101c8689e76e4ee4f5edc29896b4841ecd676142b0"

RPROVIDES:${PN} += "lxappearance"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdbus-1.so.3 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
