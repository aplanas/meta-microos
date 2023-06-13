SUMMARY = "Tool package for D-Bus/GLib bindings"
DESCRIPTION = "D-Bus add-on tool to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains dbus-binding-tool and manpage."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.112"

RPM_NAME = "dbus-1-glib-tool-0.112-3.3.aarch64.rpm"
RPM_HASH = "92127284b87ffa49dacc5bea16f0784a73b32cb0b55d4595bdef40a6eae678d90a45349d5f06821fa6edbbd90b5edd106fcd52dbeb8bc25be23cfd9d3289bd4a"

RPROVIDES:${PN} += "dbus-1-glib-tool \
dbus-1-glib-tool(aarch-64)"

RDEPENDS:${PN} += "dbus-1-glib \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libexpat.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
