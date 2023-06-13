SUMMARY = "GLib-based library for using D-Bus"
DESCRIPTION = "D-Bus add-on library to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains the shared library files."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.112"

RPM_NAME = "libdbus-glib-1-2-0.112-3.3.aarch64.rpm"
RPM_HASH = "ac777932eb97bd7d9d773e92238631a8328493c3574052a3c4a0eb454b6849f90ae70e797507c3ec6ddb7e9e1e533ef54c395d7de383e9928a7a6316937969e8"

RPROVIDES:${PN} += "dbus-1-glib \
dbus-1-glib:/usr/lib64/libdbus-glib-1.so.2 \
libdbus-glib-1-2 \
libdbus-glib-1-2(aarch-64) \
libdbus-glib-1.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
