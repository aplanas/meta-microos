SUMMARY = "Python bindings for GObject"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python39-gobject-3.44.1-1.2.aarch64.rpm"
RPM_HASH = "b80403c4c7e7f5069eacd15fbcfad1c98da06518f066ab27a77e541289433d83bbc71830541571ac7d9176fb867fa5b6953de567d9317ac5afa8ffbd29845202"

RPROVIDES:${PN} += "python3.9dist(pygobject) \
python39-gobject \
python39-gobject(aarch-64) \
python3dist(pygobject)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
python(abi) \
typelib(GLib) \
typelib(Gio)"

inherit rpm
