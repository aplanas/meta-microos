SUMMARY = "A virtual file system library API"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
GIO provides a modern, easy-to-use VFS API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.3"

RPM_NAME = "libgio-2_0-0-2.76.3-1.1.aarch64.rpm"
RPM_HASH = "48de096047d64d7858ba0c87cba222d86ce5fbb31a4efd4ea36f6b1e27c5918cd1d687bd1c1fbe576dbb2d729d357abba9bd40ddf1aa8f2bfc3f371e172e5fe7"

RPROVIDES:${PN} += "gio \
libgio-2.0.so.0()(64bit) \
libgio-2_0-0 \
libgio-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
dbus-launch \
gio-branding \
glib2-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libmount.so.1()(64bit) \
libmount.so.1(MOUNT_2.19)(64bit) \
libmount.so.1(MOUNT_2.20)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.2)(64bit) \
shared-mime-info"

inherit rpm