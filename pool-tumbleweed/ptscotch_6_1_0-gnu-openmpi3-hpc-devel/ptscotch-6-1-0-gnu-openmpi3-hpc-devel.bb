SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi3-hpc-devel-6.1.0-2.7.aarch64.rpm"
RPM_HASH = "0a94662683b71c9626cd3583e1200713ed1f65abd74047814abb2b0a29369db8a245c3aece92768faed4e35add886514e7f21e04a1d3e92dd049530475a5df03"

RPROVIDES:${PN} += "ptscotch_6_1_0-gnu-openmpi3-hpc-devel \
ptscotch_6_1_0-gnu-openmpi3-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libm.so.6()(64bit) \
libptscotch_6_1_0-gnu-openmpi3-hpc \
libz.so.1()(64bit) \
openmpi3-gnu-hpc-devel"

inherit rpm
