SUMMARY = "Qt 6 Grpc library - Development files"
DESCRIPTION = "Development files for the Qt 6 Grpc library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-grpc-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "8858466297c37543022150d40e79aa52aba0f68091a76127d1590166909f10f923fa08d3c5a3eccb3030892669ace0d52526cc8e4b1b279b774db78dd54510f1"

RPROVIDES:${PN} += "cmake-Qt6Grpc \
cmake-Qt6GrpcTools \
pkgconfig-Qt6Grpc \
qt6-grpc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
cmake-Qt6Protobuf \
ld-linux-aarch64.so.1 \
libQt6Grpc6 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-3.21.12.so \
libprotoc-3.21.12.so \
libstdc++.so.6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
pkgconfig-Qt6Protobuf \
pkgconfig-grpc++"

inherit rpm
