SUMMARY = "Automatic 3D tetrahedral mesh generator"
DESCRIPTION = "NETGEN is an automatic 3D tetrahedral mesh generator. It accepts \
input from constructive solid geometry (CSG) or boundary \
representation (BRep) from STL file format. The connection to a \
geometry kernel allows the handling of IGES and STEP files. NETGEN \
contains modules for mesh optimization and hierarchical mesh \
refinement."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "netgen-6.2.2301-1.5.aarch64.rpm"
RPM_HASH = "66800c78756130d521ab16389f7fde2e2bec045e183494d19b890125c508ed947e8e025d1155682cd13063719152b1f578bd38e6c337a7762d159606623e6aea"

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
