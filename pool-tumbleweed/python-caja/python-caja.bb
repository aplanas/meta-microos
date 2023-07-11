SUMMARY = "Python bindings for Caja"
DESCRIPTION = "This package contains bindings to write Caja extensions with Python. \
It allows writing menu, property pages and column providers \
extensions, so that Caja functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "python-caja-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "3cbe81416e856a7c6f218661067e103392b6483a6971b3a11ccab8b1ebe2ea13887f4641e06ab607c4fefb320e1b879cf9ae203512010319fa2c4f82f64c8f12"

RPROVIDES:${PN} += "libcaja-python.so \
python-caja \
python-mate-file-manager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpython3.11.so.1.0 \
python3-gobject \
typelib-Caja"

inherit rpm
