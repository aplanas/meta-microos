SUMMARY = "JavaScript bindings based on gobject-introspection and Mozilla"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later"

PV = "1.76.0"

RPM_NAME = "libgjs0-1.76.0-1.1.aarch64.rpm"
RPM_HASH = "318fc94c201d651dda2994b90a838dc8bed72489260f9f32b09a06645bb8ebfb056d575f8a1c5c7bfb57d0477272f83d71e174c0793296bcc60a24e26ad8fa74"

RPROVIDES:${PN} += "libgjs-0 \
libgjs.so.0()(64bit) \
libgjs0 \
libgjs0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libffi.so.8()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libmozjs-102.so.0()(64bit) \
libmozjs-102.so.0(mozjs_102)(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
typelib(GIRepository) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(GjsPrivate) \
typelib(cairo)"

inherit rpm
