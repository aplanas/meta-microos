SUMMARY = "Qt 6 Grpc library - Development files"
DESCRIPTION = "Development files for the Qt 6 Grpc library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-grpc-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "883f42242bbcd336b7a6c85e026563f4e513b1cff3c72e10582e77c5e9f61228eff1bedff70561ae085a39311b06f55be1f58d1474b0dfbadbc82407a88b0a91"

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
