SUMMARY = "GNOME ACL viewer and editor"
DESCRIPTION = "Eiciel allows you to visually edit file ACL entries. You can add and \
remove users and groups who will be granted permissions through the \
graphical interface"
LICENSE = "GPL-2.0-or-later"

PV = "0.10.0"

RPM_NAME = "eiciel-0.10.0-1.1.aarch64.rpm"
RPM_HASH = "ee2ec49da6cd084355d7dea4bafabcf4446e707abff832c52deb8a8450d871c5724501d5ed4f32760811214536e56357709a36917368670bc43b046c482e68d0"

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
