SUMMARY = "Python bindings for D-Bus"
DESCRIPTION = "D-Bus python bindings for use with python programs."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python39-dbus-python-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "11353e4ea1483fe50c15fa0f71ed6e9ab3695431a1983d24675364d6d207b0c5a186855080430d0cdb828721b1b28f270bd84e2e0eba19c69ee00c8a87b3e9f1"

RPROVIDES:${PN} += "dbus-1-python39 \
python39-dbus-python \
python39-dbus-python(aarch-64)"

RDEPENDS:${PN} += "dbus-1 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libglib-2.0.so.0()(64bit) \
python(abi) \
python39-gobject \
python39-xml"

inherit rpm
