SUMMARY = "Shared Libraries for Cinnamon JS module"
DESCRIPTION = "JavaScript bindings based on GObject Introspection for the \
Cinnamon Desktop. \
 \
This package provides libraries for cjs."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "5.0.0"

RPM_NAME = "libcjs0-5.0.0-1.11.aarch64.rpm"
RPM_HASH = "be69d4cd2952b60ee3e0e5ae2f1e337f18aa045be8686ea3f499d37d87dcd34dfffaba3a372f222878530a1deb7eef7a1fee1ed9968e44f69eb229d5f038b3d5"

RPROVIDES:${PN} += "libcjs.so.0 \
libcjs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libffi.so.8 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmozjs-78.so.0 \
libreadline.so.8 \
libstdc++.so.6 \
typelib-CjsPrivate \
typelib-GIRepository \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-cairo"

inherit rpm
