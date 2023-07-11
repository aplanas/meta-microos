SUMMARY = "Libguestfs GObject introspection data"
DESCRIPTION = "This package contains the GObject introspection data."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-typelib-Guestfs-1_0-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "d3ab33851dad59b11928c703a886d6184304e2561e91db3f63902e32b09f004d864829256f0bc518422d90f1b1372ed60962d661211170db08d332a607e37569"

RPROVIDES:${PN} += "libguestfs-typelib-Guestfs-1-0 \
typelib-Guestfs"

RDEPENDS:${PN} += "libguestfs-gobject-1.0.so.0 \
libguestfs.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
