SUMMARY = "Examples for the qt6-grpc modules"
DESCRIPTION = "Examples for the qt6-grpc modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-grpc-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "43f651b8e8f31c5f930f5c853d0d685fbb33331142c7f60d726dc556143f91c76245d43b5691273e47d6d8369656702ee1f17219e89968a02a32010de1483dab"

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
