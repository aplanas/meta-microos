SUMMARY = "Development files for lucene++"
DESCRIPTION = "Development files for lucene++, a high-performance, full-featured text search engine written in C++"
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.0.8"

RPM_NAME = "lucene++-devel-3.0.8-4.3.aarch64.rpm"
RPM_HASH = "4be975270f5d47736285526db9b7a59074065dd2d3ec0adf74969e1ef1a0c62f794a1758107bac56653bf2910d63829acc6d363afd2b89d10a8637fda097107c"

RPROVIDES:${PN} += "cmake-liblucene++ \
cmake-liblucene++-contrib \
lucene++-devel \
pkgconfig-liblucene++ \
pkgconfig-liblucene++-contrib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblucene++0"

inherit rpm
