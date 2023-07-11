SUMMARY = "Development files for PROJ"
DESCRIPTION = "This package contains libproj and the appropriate header files and man pages. \
 \
 \
License:        MIT"
LICENSE = "MIT"

PV = "9.2.1"

RPM_NAME = "proj-devel-9.2.1-1.1.aarch64.rpm"
RPM_HASH = "8aab3c8f86e8b2ae55fdf9c37337273b78b8002a3ed7c82aad13ca5929c267a31e48d1889a1723d8eb11668fc645861c7724b011cf56f16ac9731cf8e91856da"

RPROVIDES:${PN} += "cmake-proj \
cmake-proj4 \
libproj-devel \
pkgconfig-proj \
proj-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libproj25 \
pkgconfig-libcurl \
pkgconfig-libtiff-4 \
pkgconfig-sqlite3"

inherit rpm
