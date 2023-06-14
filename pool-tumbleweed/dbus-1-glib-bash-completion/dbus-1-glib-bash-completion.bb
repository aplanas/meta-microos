SUMMARY = "Bash-completion package for D-Bus/GLib bindings"
DESCRIPTION = "D-Bus add-on tool to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains bash-completion support for dbus-1-glib."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.112"

RPM_NAME = "dbus-1-glib-bash-completion-0.112-3.3.aarch64.rpm"
RPM_HASH = "10eea510773762d250fae985529d5c11a58957de82d43569b36bf4e1ffd0565256a818f050c7b4c1b069893ff64b6c706a309f6efb76342ceb6b872aaa1c67f7"

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
