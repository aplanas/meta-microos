SUMMARY = "Python bindings for GObject/Cairo"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Cairo bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python39-gobject-cairo-3.44.1-2.1.aarch64.rpm"
RPM_HASH = "c239e8de755af448048321ecec69f319aa91e92be66a6f9019401ec034d20b257af6b2764a11f07b3d85bb45917c59f7c551b326f45f6184cb141d35d699ce49"

RPROVIDES:${PN} += "python39-gobject-cairo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgobject-2.0.so.0 \
python-abi \
python39-cairo \
python39-gobject"

inherit rpm
