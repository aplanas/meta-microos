SUMMARY = "Tool to work with symmetric polyhedra"
DESCRIPTION = "SymPol is a C++ tool to work with symmetric polyhedra. It helps to \
compute restricted automorphisms (parts of the linear symmetry group) \
of polyhedra and performs polyhedral description conversion up to a \
given or computed symmetry group."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.9"

RPM_NAME = "sympol-0.1.9-1.11.aarch64.rpm"
RPM_HASH = "578b752e7736efb280e625d032c5843c88c4241eab5c425220d980e910886064f92257b42be18ed9f2ca967acdd940b9256eed68ba8c1bdae12bf204027bdd78"

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
