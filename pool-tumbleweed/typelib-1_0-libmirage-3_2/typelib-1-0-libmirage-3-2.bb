SUMMARY = "Introspection bindings for the libmirage CD-ROM image access library"
DESCRIPTION = "libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file. \
 \
This package provides the GObject Introspection bindings for libmirage."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "typelib-1_0-libmirage-3_2-3.2.6-1.9.aarch64.rpm"
RPM_HASH = "ec99d29fcbaac36747c6aed2149458dbb6461ed655dc85e00dfaaa9e22fe1b56dda6f2669cdd424e27e34cb61689e78f236e5837c558bb53141de69b351a3761"

RPROVIDES:${PN} += "typelib-1-0-libmirage-3-2 \
typelib-Mirage"

RDEPENDS:${PN} += "libmirage.so.11 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
