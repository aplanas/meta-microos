SUMMARY = "Tool to work with symmetric polyhedra"
DESCRIPTION = "SymPol is a C++ tool to work with symmetric polyhedra. It helps to \
compute restricted automorphisms (parts of the linear symmetry group) \
of polyhedra and performs polyhedral description conversion up to a \
given or computed symmetry group."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.9"

RPM_NAME = "sympol-0.1.9-1.10.aarch64.rpm"
RPM_HASH = "24d704e5dd9beb61a41026480cae795281198f10d7590152319c3544f29acfdfd8a8131cc118804860b54d33c41cf1f19d725f66befc17ff56c37374abd920db"

RPROVIDES:${PN} += "sympol"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libstdc++.so.6 \
libsympol.so.0.1"

inherit rpm
