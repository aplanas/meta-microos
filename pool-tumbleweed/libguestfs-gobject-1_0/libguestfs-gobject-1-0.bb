SUMMARY = "GObject bindings for libguestfs"
DESCRIPTION = "libguestfs-gobject-1_0 contains GObject bindings for libguestfs. \
 \
To develop software against these bindings, you need to install \
libguestfs-gobject-devel."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-gobject-1_0-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "7a3e863cad3ea9895632ba6c3905142767a4b16b250cddb00b7b332f45a72aa3e2f6847ea89f9171131e23a3e7cf3dce5f8028fe9407bf26b43e2e74f2e160df"

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
