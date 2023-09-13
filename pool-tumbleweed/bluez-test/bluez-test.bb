SUMMARY = "Tools for testing of various Bluetooth-functions"
DESCRIPTION = "Contains a few tools for testing various bluetooth functions. The \
BLUETOOTH trademarks are owned by Bluetooth SIG, Inc., U.S.A."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.69"

RPM_NAME = "bluez-test-5.69-1.1.aarch64.rpm"
RPM_HASH = "5e00ab956d3944d53626a02b089582138d4dde751dffc5b49cfa1f4b208470999517b46c8512dfc26a70296e369b2d0b6bf2e93f46301ea01bc0f370a2df85e1"

RPROVIDES:${PN} += "bluez-test"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
python3-dbus-python \
python3-gobject"

inherit rpm
