SUMMARY = "A virtual file system library API"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
GIO provides a modern, easy-to-use VFS API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.5"

RPM_NAME = "libgio-2_0-0-2.76.5-1.1.aarch64.rpm"
RPM_HASH = "cff0005487f816dac8e735cd5692edc9d17d2e1ef896daa9ef5d2d62f6cb33489e1b25e2fc45ce6cfd775af97f7106ec061627941ff2bc10288f28ea0f0e73c9"

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
