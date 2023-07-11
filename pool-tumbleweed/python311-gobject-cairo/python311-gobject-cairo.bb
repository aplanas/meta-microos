SUMMARY = "Python bindings for GObject/Cairo"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Cairo bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python311-gobject-cairo-3.44.1-2.1.aarch64.rpm"
RPM_HASH = "5e1e32ae70ca5dfad6c9bfa4e68610f2f8f3839c5bcfcd26d91a7399221d7091bb552959fd5180baafb70375d61904919d8c6def03918a90e9ffa4fc289bb234"

RPROVIDES:${PN} += "python3-gobject-cairo \
python311-gobject-cairo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgobject-2.0.so.0 \
python-abi \
python311-cairo \
python311-gobject"

inherit rpm
