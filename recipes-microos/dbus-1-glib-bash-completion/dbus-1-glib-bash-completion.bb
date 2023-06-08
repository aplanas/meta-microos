SUMMARY = "Bash-completion package for D-Bus/GLib bindings"
DESCRIPTION = "D-Bus add-on tool to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains bash-completion support for dbus-1-glib."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.112"

RPM_NAME = "dbus-1-glib-bash-completion-0.112-3.3.aarch64.rpm"
RPM_HASH = "10eea510773762d250fae985529d5c11a58957de82d43569b36bf4e1ffd0565256a818f050c7b4c1b069893ff64b6c706a309f6efb76342ceb6b872aaa1c67f7"

RPROVIDES:${PN} += "dbus-1-glib-bash-completion dbus-1-glib-bash-completion(aarch-64) dbus-1-glib:/etc/bash_completion.d/dbus-bash-completion.sh"
RDEPENDS:${PN} += "dbus-1-glib-tool ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libdbus-glib-1.so.2()(64bit) libexpat.so.1()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
