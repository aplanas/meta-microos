SUMMARY = "Development files for adios2-mvapich2"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
mvapich2 version of ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "adios2-mvapich2-devel-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "7dc4c2678d1f049e3af9f6f69929cd73160737633a26f7c867ec77b1cb98e879bad8ded04ffacde8ec8a57bff2c0402fbf5789d578bd807e138855482862c89f"

RPROVIDES:${PN} += "adios2-mvapich2-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libadios2-atl.so.2.9 \
libadios2-core-mpi.so.2.9 \
libadios2-core.so.2.9 \
libadios2-cxx11-mpi.so.2.9 \
libadios2-cxx11.so.2.9 \
libadios2-evpath.so.2.9 \
libadios2-ffs.so.2.9 \
libadios2-mvapich2-2-9 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
