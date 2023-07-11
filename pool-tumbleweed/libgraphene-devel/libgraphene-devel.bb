SUMMARY = "Development files for libgraphene, a thin type layer for graphic libraries"
DESCRIPTION = "The Graphene library provides types and their relative API for affine \
matrices, 4×4 matrices, projections, transformations, vectors and \
quaternions. \
 \
This subpackage contains the development files for the Graphene library."
LICENSE = "MIT"

PV = "1.10.8"

RPM_NAME = "libgraphene-devel-1.10.8-1.8.aarch64.rpm"
RPM_HASH = "74e0743446639a21dcb5da25948dcb9956baaf10832eeed081580446a478ba49ae864f5ac20faedf7be7c2ef42db8cb977cbfc91e980d25b645f69030072c330"

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
