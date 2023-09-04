SUMMARY = "Development files for adios2"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
serial version of ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "adios2-devel-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "a3ecc96ee4de207e8380092901c8aafc74b800aa920372d7b43a908445db406a0c5afd2b42e5a66f1b7bd7ed8c89cd73e2d6973b482aa695ace12636a1b28b57"

RPROVIDES:${PN} += "adios2-devel \
cmake-FindPkg \
cmake-adios2"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libadios2-2-9 \
libadios2-atl.so.2.9 \
libadios2-core.so.2.9 \
libadios2-evpath.so.2.9 \
libadios2-ffs.so.2.9 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
