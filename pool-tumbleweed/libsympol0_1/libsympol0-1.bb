SUMMARY = "Library for working with symmetric polyhedra"
DESCRIPTION = "SymPol is a C++ tool to work with symmetric polyhedra. It helps to \
compute restricted automorphisms (parts of the linear symmetry group) \
of polyhedra and performs polyhedral description conversion up to a \
given or computed symmetry group."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.9"

RPM_NAME = "libsympol0_1-0.1.9-1.10.aarch64.rpm"
RPM_HASH = "2aab2c0f71474739fc4d5ec262e88c09e112c27d7a852bddc32f75b6e9ab34a937e13268897578c7add46672393faf13ec3f7b928d4d5d20e6eaeaa0c6a7ba8e"

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
