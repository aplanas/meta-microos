SUMMARY = "Gobject introspection files for gsound"
DESCRIPTION = "GSound is a library for playing system sounds. \
It's designed to be used via GObject Introspection, \
and is a wrapper around the libcanberra C library."
LICENSE = "LGPL-2.1-only"

PV = "1.0.3"

RPM_NAME = "typelib-1_0-GSound-1_0-1.0.3-2.9.aarch64.rpm"
RPM_HASH = "6a8c681bd0e3d838ac9acc01bfe62a4accfe94f7f393e0748f2cb877da38f6084e45d2cd2a7736498c2686ab3f5e3ecd4633c6a27d6d87208c89e6b1087edb07"

RPROVIDES:${PN} += "typelib-1-0-GSound-1-0 \
typelib-GSound"

RDEPENDS:${PN} += "libgsound.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
