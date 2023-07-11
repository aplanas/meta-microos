SUMMARY = "Bash-completion package for D-Bus/GLib bindings"
DESCRIPTION = "D-Bus add-on tool to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains bash-completion support for dbus-1-glib."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.112"

RPM_NAME = "dbus-1-glib-bash-completion-0.112-3.4.aarch64.rpm"
RPM_HASH = "67af148fe88e8166f658337c96b2583e88e41b59158139e50e9908e9a764fa9dcd81900ffe0c6e13bf91cb7eca5689061be36ffd24ebe0d0dfc3e077dca20e37"

RPROVIDES:${PN} += "dbus-1-glib-/etc/bash-completion.d/dbus-bash-completion.sh \
dbus-1-glib-bash-completion"

RDEPENDS:${PN} += "dbus-1-glib-tool \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libexpat.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0"

inherit rpm
