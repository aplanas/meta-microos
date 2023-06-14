SUMMARY = "GObject bindings for libguestfs"
DESCRIPTION = "libguestfs-gobject-1_0 contains GObject bindings for libguestfs. \
 \
To develop software against these bindings, you need to install \
libguestfs-gobject-devel."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-gobject-1_0-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "96ddafb80b76b8043b6c70a95afc6c3f5717e6a556cba0e32f3c5be777aaa3cc355c04384d3df13dbc2494d3274e58850d3fb9bc1546a2097fb7334a3d425be2"

RPROVIDES:${PN} += "libguestfs-gobject-1-0 \
libguestfs-gobject-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libguestfs \
libguestfs.so.0"

inherit rpm
