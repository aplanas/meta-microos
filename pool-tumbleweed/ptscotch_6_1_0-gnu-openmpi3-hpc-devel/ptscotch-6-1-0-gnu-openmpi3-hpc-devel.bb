SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi3-hpc-devel-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "1b4c40e47089cd06a757a1e397f302f82a841a57892205f757eda2452508610ee3228a33ac1c6aaed1094a3fc9800e40f4a310851594c9abe123bc1375ee261f"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libptscotch-6-1-0-gnu-openmpi3-hpc \
libz.so.1 \
openmpi3-gnu-hpc-devel"

inherit rpm
