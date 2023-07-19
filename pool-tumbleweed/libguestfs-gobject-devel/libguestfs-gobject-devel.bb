SUMMARY = "GObject bindings for libguestfs"
DESCRIPTION = "libguestfs-gobject contains GObject bindings for libguestfs. \
 \
This package is needed if you want to write software using the \
GObject bindings.  It also contains GObject Introspection information."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-gobject-devel-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "7ef5de8bea81706bdb2762fa113b8f433d66a71ed7b65dbeed0a73e74ee7343ee61292f1d9ec882920a8eff8469115706aca516b8f108eeedff5f31c1a819246"

RPROVIDES:${PN} += "libguestfs-gobject-devel \
pkgconfig-libguestfs-gobject-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libguestfs-gobject-1-0 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libguestfs"

inherit rpm
