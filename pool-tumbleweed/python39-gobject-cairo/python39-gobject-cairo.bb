SUMMARY = "Python bindings for GObject/Cairo"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Cairo bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python39-gobject-cairo-3.44.1-1.2.aarch64.rpm"
RPM_HASH = "b0653a5514800513dac209401e3c960302c0eb445a35d9d2b4c66a971f33b3ad84a295bc028f1dc5fb19601c869a43061c3db2fb882eae27c724b68d2070f2da"

RPROVIDES:${PN} += "python39-gobject-cairo \
python39-gobject-cairo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgobject-2.0.so.0()(64bit) \
python(abi) \
python39-cairo \
python39-gobject"

inherit rpm
