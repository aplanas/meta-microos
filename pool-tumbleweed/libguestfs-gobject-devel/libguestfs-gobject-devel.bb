SUMMARY = "GObject bindings for libguestfs"
DESCRIPTION = "libguestfs-gobject contains GObject bindings for libguestfs. \
 \
This package is needed if you want to write software using the \
GObject bindings.  It also contains GObject Introspection information."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-gobject-devel-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "efff06a0502c11b54b265662df371b18b08284c5d59aedd495c815f27a417d39a986794af65a458e5cd91fb43fe24576b4e4f1759a4e6a58039405c4a3f9be92"

RPROVIDES:${PN} += "libguestfs-gobject-devel \
pkgconfig-libguestfs-gobject-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libguestfs-gobject-1-0 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libguestfs"

inherit rpm
