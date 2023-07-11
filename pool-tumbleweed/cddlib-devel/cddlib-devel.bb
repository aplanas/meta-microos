SUMMARY = "Header files for cddlib"
DESCRIPTION = "cddlib is a C implementation of the Double Description Method of \
Motzkin et al. for generating all vertices (i.e. extreme points) and \
extreme rays of a general convex polyhedron in R^d given by a system \
of linear inequalities. \
 \
This package contains the headers for the C library."
LICENSE = "GPL-2.0-or-later"

PV = "0.94m"

RPM_NAME = "cddlib-devel-0.94m-1.11.aarch64.rpm"
RPM_HASH = "cbe7fb1d0d49d9af83c75c06b0bb9acbd48d042542ef929bc34ca969d2efc9ad79b5647af3ed3f16f6c7f5f613c5f1c8f53bfd4667ef05384e05418cfa82b6db"

RPROVIDES:${PN} += "cddlib-devel \
pkgconfig-cddlib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gmp-devel \
libcdd0"

inherit rpm
