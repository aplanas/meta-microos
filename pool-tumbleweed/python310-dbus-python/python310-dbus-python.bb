SUMMARY = "Python bindings for D-Bus"
DESCRIPTION = "D-Bus python bindings for use with python programs."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python310-dbus-python-1.3.2-2.2.aarch64.rpm"
RPM_HASH = "2e2f0587fe3fc30a0a2dd306103e76efc04a429b65fa3781507c95ab57cd9b550adbafb8e918d26f2b4c19184bf804a4e6985e18d8f1d726bcd7e7b004d36083"

RPROVIDES:${PN} += "dbus-1-python310 \
python310-dbus-python"

RDEPENDS:${PN} += "dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
python-abi \
python310-gobject \
python310-xml"

inherit rpm
