SUMMARY = "C++ Interface for Gio"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.0"

RPM_NAME = "libgiomm-2_68-1-2.76.0-1.2.aarch64.rpm"
RPM_HASH = "f7c5f4acffee77db46b8971033d02302da8f54ab95292cbaaabfc348dbf393622edb76a3625ac0e9f3f40f02c7c631fff45a4cfb29a8c5ef22ce0c6a6105d85e"

RPROVIDES:${PN} += "libgiomm-2-68-1 \
libgiomm-2.68.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
