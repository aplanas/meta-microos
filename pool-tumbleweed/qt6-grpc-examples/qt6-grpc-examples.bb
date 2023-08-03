SUMMARY = "Examples for the qt6-grpc modules"
DESCRIPTION = "Examples for the qt6-grpc modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-grpc-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a85c1b9c2c63c1c41e25aee17de039f84f880a639f90665ab6f3885c06b0b291f59d9eaca3a786d0b7133807dee9405161a4e924289461a069aaab17a4170d1f"

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
libstdc++.so.6"

inherit rpm
