SUMMARY = "Python bindings for D-Bus"
DESCRIPTION = "D-Bus python bindings for use with python programs."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python39-dbus-python-1.3.2-2.2.aarch64.rpm"
RPM_HASH = "558632f04d621cbf1121691a4573ee4dacbb60ccb3f29af9c432f8edff19e16086ba924b0985716564d1d3c432a6f393d90ca115d1436353c5ba93c911648498"

RPROVIDES:${PN} += "dbus-1-python39 \
python39-dbus-python"

RDEPENDS:${PN} += "dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
python-abi \
python39-gobject \
python39-xml"

inherit rpm
