SUMMARY = "Qt 6 Protobuf library - Development files"
DESCRIPTION = "Development files for the Qt 6 Protobuf library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-protobuf-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f71d7baf6213a619e45bea22cbadc06b1679123d153f65aa6da8078eec7a66a77d7de970c4cd5cd4c9e13cf9589e899d10095ad650d2cb98fb1e42996c3c9cfb"

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
