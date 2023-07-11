SUMMARY = "GObject introspection for libgraphene, a thin type layer for graphic libraries"
DESCRIPTION = "The Graphene library provides types and their relative API for affine \
matrices, 4×4 matrices, projections, transformations, vectors and \
quaternions."
LICENSE = "MIT"

PV = "1.10.8"

RPM_NAME = "typelib-1_0-Graphene-1_0-1.10.8-1.8.aarch64.rpm"
RPM_HASH = "40688fd797d9cff478ab1dc13c11b2d803dd54d1b0c1dbdaae3574071a779bc2a176a47bd16e91be27be47289b146d4abc401ca52d30f8122835b1e5855b0031"

RPROVIDES:${PN} += "typelib-1-0-Graphene-1-0 \
typelib-Graphene"

RDEPENDS:${PN} += "libgraphene-1.0.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
