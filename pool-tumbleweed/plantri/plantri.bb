SUMMARY = "Programs for generating certain types of planar graphs"
DESCRIPTION = "plantri is a program that generates certain types of graphs that are \
embedded on the sphere. \
 \
Exactly one member of each isomorphism class is output, using an \
amount of memory almost independent of the number of graphs produced. \
Isomorphisms are defined with respect to the imbeddings, so in some \
cases outputs may be isomorphic as abstract graphs."
LICENSE = "Apache-2.0"

PV = "5.3"

RPM_NAME = "plantri-5.3-1.4.aarch64.rpm"
RPM_HASH = "8a7412eb121c4c540843f81a6391221edb8b252b85bd559b028d8175e489e9880ccb7bccf48502e1f21de24e0c5cf998be1a411e37ef8e8bc766f4a53aa12f79"

RPROVIDES:${PN} += "plantri"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
