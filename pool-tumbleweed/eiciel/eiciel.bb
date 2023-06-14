SUMMARY = "GNOME ACL viewer and editor"
DESCRIPTION = "Eiciel allows you to visually edit file ACL entries. You can add and \
remove users and groups who will be granted permissions through the \
graphical interface"
LICENSE = "GPL-2.0-or-later"

PV = "0.10.0.rc2"

RPM_NAME = "eiciel-0.10.0.rc2-1.3.aarch64.rpm"
RPM_HASH = "509ab4753aedc723382bd0b5cb90e6aade0f121b8f896fbadb59a06ad203e8c76bc27c479972a3bd3c708814a5f9deaea864dd2c4bbf0ec08539d4948b2f27d3"

RPROVIDES:${PN} += "eiciel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtkmm-4.0.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
