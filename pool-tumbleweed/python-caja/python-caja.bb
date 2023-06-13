SUMMARY = "Python bindings for Caja"
DESCRIPTION = "This package contains bindings to write Caja extensions with Python. \
It allows writing menu, property pages and column providers \
extensions, so that Caja functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "python-caja-1.26.0-1.10.aarch64.rpm"
RPM_HASH = "90c156033807a956039cb4a244b2d59aba27da0adb62106502a3a2d61a204864587ef95e94304c7ed8cf384b11cbe4d0761d00519117b3145e6ca5d9b10e44ae"

RPROVIDES:${PN} += "libcaja-python.so()(64bit) \
python-caja \
python-caja(aarch-64) \
python-mate-file-manager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcaja-extension.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
python3-gobject \
typelib(Caja)"

inherit rpm
