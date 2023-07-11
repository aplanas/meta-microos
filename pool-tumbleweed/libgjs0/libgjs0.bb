SUMMARY = "JavaScript bindings based on gobject-introspection and Mozilla"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later"

PV = "1.76.2"

RPM_NAME = "libgjs0-1.76.2-1.1.aarch64.rpm"
RPM_HASH = "325546abb934236fb9296ef2f841cc4fe6b8da88ae90b4a9f287aa5df5a6e56499120fe7692024b38ac9ed7021ad3bcd12031679c067722291145f93da113e6a"

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
