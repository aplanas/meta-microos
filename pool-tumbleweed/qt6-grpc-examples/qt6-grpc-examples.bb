SUMMARY = "Examples for the qt6-grpc modules"
DESCRIPTION = "Examples for the qt6-grpc modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-grpc-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9fd7054ea81605dbde5a173d4b1bd4589fb337bf85f0b02dbb318c7eb7f05d094f2d7685dcdc515262ed357df19ffe9d95b911342e251bda0c1fd8c61bc28fed"

RPROVIDES:${PN} += "libprotobuf-sensors.so \
qt6-grpc-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Grpc.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Protobuf.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgpr.so.31 \
libgrpc++.so.1.54 \
libgrpc.so.31 \
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
