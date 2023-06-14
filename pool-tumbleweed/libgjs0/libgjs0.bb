SUMMARY = "JavaScript bindings based on gobject-introspection and Mozilla"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later"

PV = "1.76.0"

RPM_NAME = "libgjs0-1.76.0-1.1.aarch64.rpm"
RPM_HASH = "318fc94c201d651dda2994b90a838dc8bed72489260f9f32b09a06645bb8ebfb056d575f8a1c5c7bfb57d0477272f83d71e174c0793296bcc60a24e26ad8fa74"

RPROVIDES:${PN} += "libgjs-0 \
libgjs.so.0 \
libgjs0"

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
libmozjs-102.so.0 \
libreadline.so.8 \
libstdc++.so.6 \
typelib-GIRepository \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-GjsPrivate \
typelib-cairo"

inherit rpm
