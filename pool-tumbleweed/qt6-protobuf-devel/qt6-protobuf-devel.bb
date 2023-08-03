SUMMARY = "Qt 6 Protobuf library - Development files"
DESCRIPTION = "Development files for the Qt 6 Protobuf library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-protobuf-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "810eb705a3acc642a9ced40892943e90dff13e80affa3c04a9416029ab09967d751caec514f75eb1c7f5b597cc88274be7d441c421f8a4df436fd4702d5c2910"

RPROVIDES:${PN} += "cmake-Qt6Protobuf \
cmake-Qt6ProtobufTools \
pkgconfig-Qt6Protobuf \
qt6-protobuf-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
ld-linux-aarch64.so.1 \
libQt6Protobuf6 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-3.21.12.so \
libprotoc-3.21.12.so \
libstdc++.so.6 \
pkgconfig-Qt6Core \
pkgconfig-protobuf"

inherit rpm
