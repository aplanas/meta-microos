SUMMARY = "GObject bindings for libguestfs"
DESCRIPTION = "libguestfs-gobject contains GObject bindings for libguestfs. \
 \
This package is needed if you want to write software using the \
GObject bindings.  It also contains GObject Introspection information."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-gobject-devel-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "67b0d8b7804df1e78749cbc376bfc6b8f3b17177f53f5b104d1ce6765787423f3e20a729e41b25297ecd7a57f8a74a5c0bd560d78ca5a9062f843e5d4d8e2d58"

RPROVIDES:${PN} += "libguestfs-gobject-devel \
pkgconfig-libguestfs-gobject-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libguestfs-gobject-1-0 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libguestfs"

inherit rpm
