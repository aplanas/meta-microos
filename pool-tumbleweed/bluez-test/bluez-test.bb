SUMMARY = "Tools for testing of various Bluetooth-functions"
DESCRIPTION = "Contains a few tools for testing various bluetooth functions. The \
BLUETOOTH trademarks are owned by Bluetooth SIG, Inc., U.S.A."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.66"

RPM_NAME = "bluez-test-5.66-1.6.aarch64.rpm"
RPM_HASH = "04658850b43ef8fc4c231b76d87c0dd83ccce6e7a2f1b4241a13b32190dbf78573b2e3a79699a1be94d01a52254040e6806355208784c801a9a833ab75c4ecd5"

RPROVIDES:${PN} += "bluez-test \
bluez-test(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libreadline.so.8()(64bit) \
python3-dbus-python \
python3-gobject"

inherit rpm
