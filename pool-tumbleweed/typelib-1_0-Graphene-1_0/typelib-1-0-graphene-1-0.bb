SUMMARY = "GObject introspection for libgraphene, a thin type layer for graphic libraries"
DESCRIPTION = "The Graphene library provides types and their relative API for affine \
matrices, 4×4 matrices, projections, transformations, vectors and \
quaternions."
LICENSE = "MIT"

PV = "1.10.8"

RPM_NAME = "typelib-1_0-Graphene-1_0-1.10.8-1.7.aarch64.rpm"
RPM_HASH = "7073e899f00d1516014885924d345ef7dbf9bdbccb2f5b7ab587a734cd4d44140dbdcbda87ef1468835f5cb6faa3c07c875f90e938dc19a400e29ee1ffc83418"

RPROVIDES:${PN} += "typelib(Graphene) \
typelib-1_0-Graphene-1_0 \
typelib-1_0-Graphene-1_0(aarch-64)"
RDEPENDS:${PN} += "libgraphene-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
