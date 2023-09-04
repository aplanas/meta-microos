SUMMARY = "Tools for testing of various Bluetooth-functions"
DESCRIPTION = "Contains a few tools for testing various bluetooth functions. The \
BLUETOOTH trademarks are owned by Bluetooth SIG, Inc., U.S.A."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.68"

RPM_NAME = "bluez-test-5.68-4.1.aarch64.rpm"
RPM_HASH = "cb4dbcbbbccb05820e467a004a90e114bbdbff95c747584684f4dd215de5394fa014202ed89dc21ffaba84b89edd33197053c32193bfa6eaa207431e483dbbd0"

RPROVIDES:${PN} += "bluez-test"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
python3-dbus-python \
python3-gobject"

inherit rpm
