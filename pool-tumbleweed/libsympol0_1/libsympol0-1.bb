SUMMARY = "Library for working with symmetric polyhedra"
DESCRIPTION = "SymPol is a C++ tool to work with symmetric polyhedra. It helps to \
compute restricted automorphisms (parts of the linear symmetry group) \
of polyhedra and performs polyhedral description conversion up to a \
given or computed symmetry group."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.9"

RPM_NAME = "libsympol0_1-0.1.9-1.11.aarch64.rpm"
RPM_HASH = "908ca8803077de516d8c6078002cdfd9c1b7620a43ffe669ca96f332c87cf561e0fdc954e4781b736619d1550557e2dc1c776bc5c01406df8ff8f2cbe8206f39"

RPROVIDES:${PN} += "libsympol.so.0.1 \
libsympol0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbliss.so.0.77 \
libc.so.6 \
libcddgmp.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
liblrs.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
