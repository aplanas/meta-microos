SUMMARY = "GObject bindings for libguestfs"
DESCRIPTION = "libguestfs-gobject-1_0 contains GObject bindings for libguestfs. \
 \
To develop software against these bindings, you need to install \
libguestfs-gobject-devel."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-gobject-1_0-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "aefb0c373e78d80a19361ec18ce6bec87d925bcdd4f1e89611ea99ed08b63d477731f583aa3c0f7e6706b75beacb379830e22560f187af8dd0536e8761dfb069"

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
