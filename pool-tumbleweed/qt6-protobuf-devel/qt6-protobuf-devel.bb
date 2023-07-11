SUMMARY = "Qt 6 Protobuf library - Development files"
DESCRIPTION = "Development files for the Qt 6 Protobuf library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-protobuf-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "08955a213f0c57634a88d73b43289d2022a47fee21c8b0c608530ce9b7ee6c3517c8ca91a97bc9a3ecee20fefbd0ba59b7e159da91b9b32a7193f20cc437fe1c"

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
