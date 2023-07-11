SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi2-hpc-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "0e5e3e0f196e4f0d0f1208882062aead8769352eddfc93f768e947c26b1b6e969a90fbe68aa8cf988c9ad36de25e7c43d29fae1e5572de62060514168575ee91"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libptscotch-6-1-0-gnu-openmpi2-hpc \
libz.so.1 \
openmpi2-gnu-hpc-devel"

inherit rpm
