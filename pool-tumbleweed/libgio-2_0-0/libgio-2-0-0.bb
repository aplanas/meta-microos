SUMMARY = "A virtual file system library API"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
GIO provides a modern, easy-to-use VFS API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.4"

RPM_NAME = "libgio-2_0-0-2.76.4-1.1.aarch64.rpm"
RPM_HASH = "6281b0f5a4f6993a6bd311eaa048b53c7da5882dcca61480174a09117f7aaefdb59bf55ea77b66e9c5e6040b708ea4fa5350c7d6a0acff987be6fe4f3d94822a"

RPROVIDES:${PN} += "gio \
libgio-2-0-0 \
libgio-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
dbus-launch \
gio-branding \
glib2-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libmount.so.1 \
libselinux.so.1 \
libz.so.1 \
shared-mime-info"

inherit rpm
