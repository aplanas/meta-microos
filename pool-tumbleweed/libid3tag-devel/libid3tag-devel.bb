SUMMARY = "Development package for libid3tag library"
DESCRIPTION = "This package contains the header files and static libraries needed to \
develop applications with libid3tag."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "libid3tag-devel-0.16.2-1.6.aarch64.rpm"
RPM_HASH = "c93abeb13800a54d43cec406ae0bd60930de835182d1da36b5c22245b7cbdf5093f8700c30251f72ee1edeee227b9a014a17a8696e6fd6fdda47f17d9218f2fc"

RPROVIDES:${PN} += "cmake-id3tag \
libid3tag-devel \
pkgconfig-id3tag"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libid3tag0-16-2"

inherit rpm
