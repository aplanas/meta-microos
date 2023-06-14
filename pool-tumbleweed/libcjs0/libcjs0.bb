SUMMARY = "Shared Libraries for Cinnamon JS module"
DESCRIPTION = "JavaScript bindings based on GObject Introspection for the \
Cinnamon Desktop. \
 \
This package provides libraries for cjs."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "5.0.0"

RPM_NAME = "libcjs0-5.0.0-1.10.aarch64.rpm"
RPM_HASH = "a0524ea3985c5b6bd3193ac8e129095af468bffa20c80a7abae46147ebc3e6f214bcee862eff97e57eebc7e99d4a436d93a055a5a9bd793dee5e79ebfd0f7b07"

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
