SUMMARY = "Qt 6 PositioningQuick library"
DESCRIPTION = "The Qt 6 PositioningQuick library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6PositioningQuick6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "2e9325373feb4f0bd0a4a39e492391c0eb3033c4f5e05ca7d771b0042c6c891a2eb0a4465b5251581afc1daa8652b7be6c9c22941dc7069f7003f3a3b96b8709"

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
