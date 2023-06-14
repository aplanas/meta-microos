SUMMARY = "Python bindings for GObject"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects."
LICENSE = "LGPL-2.1-or-later"

PV = "2.28.7"

RPM_NAME = "python-gobject2-2.28.7-4.6.aarch64.rpm"
RPM_HASH = "9670b92c26c9ec333f29c833aad1f4d2fba863d3c8d90646953afe1a50bef360dec9069ef2c3eb0e41c9b69e17b463d7e300882a88d801e0ee13e31e0e73ec8b"

RPROVIDES:${PN} += "libpyglib-2.0-python.so.0 \
python-gobject2 \
python2-gobject2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
python \
python-abi"

inherit rpm
