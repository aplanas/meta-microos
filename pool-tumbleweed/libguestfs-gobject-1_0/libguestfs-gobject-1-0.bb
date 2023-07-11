SUMMARY = "GObject bindings for libguestfs"
DESCRIPTION = "libguestfs-gobject-1_0 contains GObject bindings for libguestfs. \
 \
To develop software against these bindings, you need to install \
libguestfs-gobject-devel."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-gobject-1_0-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "9c5e4ee23a4b0bef8d5fa8eed5bea48a95898f0bbb57b1b47cff6f66ed1361ff8066d1c6fcc1d70ced9128d9cad528c9f6946871def0e10a9ffa41090b265dfe"

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
