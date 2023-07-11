SUMMARY = "VDE plug header files"
DESCRIPTION = "This package contains VDE plug header files"
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdeplug-devel-2.3.2+svn587-3.24.aarch64.rpm"
RPM_HASH = "9565b530f7fb07d187c9ab6a67339d5a6e07af9feaa38a2b5ed94c91ba097cb3c3f025e691441ad9f7587d404dd9432751d0cb6d8cb81c86d2842a6f143edf10"

RPROVIDES:${PN} += "libvdeplug-devel \
libvdeplug3-devel \
pkgconfig-vdeplug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvdeplug3 \
vde2"

inherit rpm
