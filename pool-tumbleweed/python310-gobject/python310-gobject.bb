SUMMARY = "Python bindings for GObject"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python310-gobject-3.44.1-2.1.aarch64.rpm"
RPM_HASH = "676df8f02cbb318ae2b6f36fd6e3adbad44eb1fe6eaf7c35c81814afdeba85df157f9e915d70ea4207f350564fe79c1e238c3cad88cf7707dcc9a33609d2d242"

RPROVIDES:${PN} += "python3.10dist-pygobject \
python310-gobject \
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
