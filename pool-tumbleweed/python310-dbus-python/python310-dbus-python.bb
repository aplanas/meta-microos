SUMMARY = "Python bindings for D-Bus"
DESCRIPTION = "D-Bus python bindings for use with python programs."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python310-dbus-python-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "fa101f86639c1435ecbd628cd5e58c659ed8b01fb4aa685ab699b7e74a7f3d82ee1a4a5403afa5d7edd30db2c8b37355c9be6cf4ce9130b540e9b501b64c1f28"

RPROVIDES:${PN} += "dbus-1-python3 \
dbus-1-python310 \
python3-dbus-python \
python310-dbus-python \
python310-dbus-python(aarch-64)"

RDEPENDS:${PN} += "dbus-1 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libglib-2.0.so.0()(64bit) \
python(abi) \
python310-gobject \
python310-xml"

inherit rpm
