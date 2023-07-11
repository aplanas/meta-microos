SUMMARY = "GLib-based library for using D-Bus"
DESCRIPTION = "D-Bus add-on library to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains the shared library files."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.112"

RPM_NAME = "libdbus-glib-1-2-0.112-3.4.aarch64.rpm"
RPM_HASH = "abf527b8d6953282a05220ea4ad4c3816c1615695e830e8f559610c894554a6bc03f68de48627287d54614c4ed178934c2fcf751f12b4e8393babed3bc4c7d1c"

RPROVIDES:${PN} += "dbus-1-glib \
dbus-1-glib-/usr/lib64/libdbus-glib-1.so.2 \
libdbus-glib-1-2 \
libdbus-glib-1.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
