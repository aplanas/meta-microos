SUMMARY = "Python bindings for GObject/Cairo"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Cairo bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python311-gobject-cairo-3.44.1-1.2.aarch64.rpm"
RPM_HASH = "b02cf95598845575602804302ecb78c4b4c5e5d60368a7e4d9e1c42667b8690d62d100833077c537b8f5ffe6de86cde4c4a690b6b37666d51d993a7e8d31d3ed"

RPROVIDES:${PN} += "python311-gobject-cairo \
python311-gobject-cairo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgobject-2.0.so.0()(64bit) \
python(abi) \
python311-cairo \
python311-gobject"

inherit rpm
