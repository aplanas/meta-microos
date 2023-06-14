SUMMARY = "Development files for libgraphene, a thin type layer for graphic libraries"
DESCRIPTION = "The Graphene library provides types and their relative API for affine \
matrices, 4×4 matrices, projections, transformations, vectors and \
quaternions. \
 \
This subpackage contains the development files for the Graphene library."
LICENSE = "MIT"

PV = "1.10.8"

RPM_NAME = "libgraphene-devel-1.10.8-1.7.aarch64.rpm"
RPM_HASH = "313041bdd390b2594b3e8cade575df710ae7e72176ca43a8f40e8a95c49cf26a713fc6925df92147087628a611c277539eea43878ca187178aa6737a37bc6efe"

RPROVIDES:${PN} += "libgraphene-devel \
pkgconfig-graphene-1.0 \
pkgconfig-graphene-gobject-1.0"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgraphene-1-0-0 \
libgraphene-1.0.so.0 \
pkgconfig-gobject-2.0 \
pkgconfig-graphene-1.0 \
typelib-1-0-Graphene-1-0 \
typelib-Graphene"

inherit rpm
