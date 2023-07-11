SUMMARY = "Development Tools for Programs which will use the libtiff Library"
DESCRIPTION = "This package contains the header files and static libraries for \
developing programs which will manipulate TIFF format image files using \
the libtiff library."
LICENSE = "HPND"

PV = "4.5.1"

RPM_NAME = "libtiff-devel-4.5.1-1.1.aarch64.rpm"
RPM_HASH = "caeb4bea701d36dff7b69065179fe594e0783fd9776872a8d938e2b2b2556158d183330034e163f6053ad14d407a7be1d662e8a2cdfd349e2d5e3525b9144b66"

RPROVIDES:${PN} += "libtiff-devel \
pkgconfig-libtiff-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libstdc++-devel \
libtiff6 \
pkgconfig-libjpeg \
pkgconfig-liblzma \
pkgconfig-libzstd \
pkgconfig-zlib"

inherit rpm
