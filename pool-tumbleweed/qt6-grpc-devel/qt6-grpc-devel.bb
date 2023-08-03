SUMMARY = "Qt 6 Grpc library - Development files"
DESCRIPTION = "Development files for the Qt 6 Grpc library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-grpc-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3f6049a06d543e980cb678d2453c34a30112385a4b3f4525e8c0df1b1e5f499eee71e676b11d547a198204d083ee9d55f0fd8b77dd106bc579e9431be5b2f71c"

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
