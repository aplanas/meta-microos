SUMMARY = "Qt 5 Serial Bus Addon"
DESCRIPTION = "The Qt Serial Bus API provides classes and functions to access the \
various industrial serial buses and protocols, such as CAN, ModBus, \
and others."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtserialbus-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "c0d00d22b1780050f663e2e73921db009efc80793d4bf8cbec7d9420aa67eae442789921f17bdeca31260db7bc5da0ddf115aff06ae97e7cd963765277c22487"

RPROVIDES:${PN} += "libqt5-qtserialbus \
libqtpassthrucanbus.so \
libqtpeakcanbus.so \
libqtsocketcanbus.so \
libqttinycanbus.so \
libqtvirtualcanbus.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5SerialBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
