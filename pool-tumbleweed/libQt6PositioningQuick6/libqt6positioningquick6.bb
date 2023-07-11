SUMMARY = "Qt 6 PositioningQuick library"
DESCRIPTION = "The Qt 6 PositioningQuick library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6PositioningQuick6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "04f9f380865de4f1149c9117a1982b8e334ad40ddd49010da1a0e8cd159faf439f02f7f2a116f4faae3e47be7c0a92eb0dcf0ed0689f8d0ffff1ed1661f0c2b3"

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
