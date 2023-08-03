SUMMARY = "Development files for adios2-openmpi3"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
openmpi3 version of ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.0"

RPM_NAME = "adios2-openmpi3-devel-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "4776f46155b9871c8bdbea5f6ab775ddc3521bfcfcd37ce348dfd85cedfe65ddc9a5eb0cfd16cc3dda937893e2ca65400757be451b63792b02e1fc414666589a"

RPROVIDES:${PN} += "adios2-openmpi3-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libadios2-atl.so.2.9 \
libadios2-core-mpi.so.2.9 \
libadios2-core.so.2.9 \
libadios2-cxx11-mpi.so.2.9 \
libadios2-cxx11.so.2.9 \
libadios2-evpath.so.2.9 \
libadios2-ffs.so.2.9 \
libadios2-openmpi3-2-9 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
