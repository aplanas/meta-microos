SUMMARY = "Libguestfs GObject introspection data"
DESCRIPTION = "This package contains the GObject introspection data."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-typelib-Guestfs-1_0-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "c7e11dc7ed0bfae1dbe7693912b37a56d37ac2dea5bcc7c49e8eb37b1a154596d75c8de9bf3b5f1e572c27ffdc132872f570a7b11a2d8c2168e98bbb6b613101"

RPROVIDES:${PN} += "libguestfs-typelib-Guestfs-1-0 \
typelib-Guestfs"

RDEPENDS:${PN} += "libguestfs-gobject-1.0.so.0 \
libguestfs.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
