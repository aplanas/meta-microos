SUMMARY = "Qt 6 PositioningQuick library"
DESCRIPTION = "The Qt 6 PositioningQuick library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6PositioningQuick6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "674c9982d2b27fa646b93a408f8f8f6e4e461d971d5dee08fc0acf618ac5193c3393325e89cba2961c7419a2527146872d9fd53943b606a312a7129bc62f4e6a"

RPROVIDES:${PN} += "libQt6PositioningQuick.so.6 \
libQt6PositioningQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
