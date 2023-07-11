SUMMARY = "Python bindings for GObject"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python39-gobject-3.44.1-2.1.aarch64.rpm"
RPM_HASH = "0f38cc0a5b6f12b01ba754a2761ccb1b9b72468c7394d3f7b2ae226d4668623a54b65fb11ee8631edc4ef9f099b102765a48f34229c384140f1a2c9516c2614a"

RPROVIDES:${PN} += "python3.9dist-pygobject \
python39-gobject \
python3dist-pygobject"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
python-abi \
typelib-GLib \
typelib-Gio"

inherit rpm
