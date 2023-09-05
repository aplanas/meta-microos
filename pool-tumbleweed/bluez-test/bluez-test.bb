SUMMARY = "Tools for testing of various Bluetooth-functions"
DESCRIPTION = "Contains a few tools for testing various bluetooth functions. The \
BLUETOOTH trademarks are owned by Bluetooth SIG, Inc., U.S.A."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.68"

RPM_NAME = "bluez-test-5.68-4.2.aarch64.rpm"
RPM_HASH = "6491a497c7017ee496a357561409df1e1258bdf5247d8e26d35cb79da742dd7e4bfb2b24d3a0e1b3d1a040aa704ee37f0eac3e7fd3075a1e1f8badfd498c45d4"

RPROVIDES:${PN} += "bluez-test"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
python3-dbus-python \
python3-gobject"

inherit rpm
