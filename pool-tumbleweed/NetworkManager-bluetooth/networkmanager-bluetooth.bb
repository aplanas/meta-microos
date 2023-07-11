SUMMARY = "Bluetooth device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for Bluetooth devices."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.8"

RPM_NAME = "NetworkManager-bluetooth-1.42.8-1.1.aarch64.rpm"
RPM_HASH = "85d74378705ff922429cadd711cdb172dfc1c26a548bdd593f9809d06d974465e4eeb8c30bc1458b03b8c0810cbef5036c512a434db679447c50f3617db51625"

RPROVIDES:${PN} += "NetworkManager-bluetooth \
libnm-device-plugin-bluetooth.so"

RDEPENDS:${PN} += "NetworkManager \
NetworkManager-wwan \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnm-wwan.so"

inherit rpm
