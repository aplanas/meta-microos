SUMMARY = "GObject-based Plugin Engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "libpeas-gtk-1_0-0-1.36.0-1.2.aarch64.rpm"
RPM_HASH = "e52a8f0fbc2788162c53169efacb4b57bfbb7d1d68bc34936130ebcda8de4a2516db86838c5b124acdf00a878d2159701de86b00ff9d8d63e759befe6f1433e5"

RPROVIDES:${PN} += "libpeas-gtk-1-0-0 \
libpeas-gtk-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
