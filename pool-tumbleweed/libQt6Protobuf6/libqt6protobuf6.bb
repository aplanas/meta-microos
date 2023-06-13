SUMMARY = "Qt 6 Protobuf library"
DESCRIPTION = "The Qt 6 Protobuf library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Protobuf6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9f5543bbc9cf850a858390d3c0c5944464cb5dbd6aa10dcd2bb31736134b7f05e9edec1cebee8609e0db00c753886aa7e0f0bb39606a20807ef5ef486de0ce90"

RPROVIDES:${PN} += "libQt6Protobuf.so.6()(64bit) \
libQt6Protobuf.so.6(Qt_6)(64bit) \
libQt6Protobuf6 \
libQt6Protobuf6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
