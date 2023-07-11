SUMMARY = "Tool package for D-Bus/GLib bindings"
DESCRIPTION = "D-Bus add-on tool to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains dbus-binding-tool and manpage."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.112"

RPM_NAME = "dbus-1-glib-tool-0.112-3.4.aarch64.rpm"
RPM_HASH = "c57abeafe32cbb4ca04461c2d5dbbdec725ec294c536127bf17b6ea520b7bc127cecfbd6ccedb94718fcdeade14554bd5ea592bd76dfa4e7eff055a776195554"

RPROVIDES:${PN} += "dbus-1-glib-tool"

RDEPENDS:${PN} += "dbus-1-glib \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libexpat.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
