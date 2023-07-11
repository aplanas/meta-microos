SUMMARY = "Python bindings for GObject"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python311-gobject-3.44.1-2.1.aarch64.rpm"
RPM_HASH = "a91e22a70df21cf754188c9370a954777dcafda0c0780f3ef1b193bb7350c7798fd3969e7471b0575970e302165ff73248f41a6126cf439889a6b9ec8ec98c68"

RPROVIDES:${PN} += "python3-gobject \
python3.11dist-pygobject \
python311-gobject \
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
