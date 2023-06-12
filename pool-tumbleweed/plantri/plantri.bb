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

RPM_NAME = "plantri-5.3-1.3.aarch64.rpm"
RPM_HASH = "7405eb9d9e888c3c0627f0bf56dd6d391d0eb3d886343d10eb6002e8f27fbbf591fc0cc43ae9b80777859478a844ce7b3e54dc18ac2cfe310af88550a3e3ed40"

RPROVIDES:${PN} += "plantri \
plantri(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
