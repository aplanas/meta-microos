SUMMARY = "Automatic 3D tetrahedral mesh generator"
DESCRIPTION = "NETGEN is an automatic 3D tetrahedral mesh generator. It accepts \
input from constructive solid geometry (CSG) or boundary \
representation (BRep) from STL file format. The connection to a \
geometry kernel allows the handling of IGES and STEP files. NETGEN \
contains modules for mesh optimization and hierarchical mesh \
refinement."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "netgen-6.2.2301-1.4.aarch64.rpm"
RPM_HASH = "302ed32f1d25183d47cbed1839f8622181a6f47b927453e88421227c8cd47ef5fcd12a12a4a706a532cdb65a828fa75808b56c95c5fe2318a3a670ab62994b2c"

RPROVIDES:${PN} += "netgen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libngcore.so \
libnggui.so \
libnglib.so \
libstdc++.so.6 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
