SUMMARY = "Development files for taglib"
DESCRIPTION = "This package contains development files for taglib."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.1"

RPM_NAME = "libtag-devel-1.13.1-1.1.aarch64.rpm"
RPM_HASH = "3b8d73f10e1a3d4bf4b6b1e659c3b215c372d69435c0ab6f044c69230170f83f8b5d199d6ce284bb547ef977bf42fb85e77a494c8bd7d0d2bb88eef61ef76c3c"

RPROVIDES:${PN} += "libtag-devel \
pkgconfig-taglib \
pkgconfig-taglib-c \
taglib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libstdc++-devel \
libtag-c0 \
libtag1 \
pkgconfig-taglib \
zlib-devel"

inherit rpm
