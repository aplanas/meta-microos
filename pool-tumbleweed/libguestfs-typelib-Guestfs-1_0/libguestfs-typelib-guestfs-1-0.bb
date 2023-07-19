SUMMARY = "Libguestfs GObject introspection data"
DESCRIPTION = "This package contains the GObject introspection data."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-typelib-Guestfs-1_0-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "4fed8a58388bc34715eece1a719c5467703fabba2d4c8375f85d942dd87ec040ec4bda1febd4178f84c8b9facd32a5b6bcec8c966181732fbccd1e3e830a8229"

RPROVIDES:${PN} += "libguestfs-typelib-Guestfs-1-0 \
typelib-Guestfs"

RDEPENDS:${PN} += "libguestfs-gobject-1.0.so.0 \
libguestfs.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
