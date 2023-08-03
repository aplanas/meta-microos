SUMMARY = "Development files for adios2"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package contains all files needed to create projects that use the \
serial version of ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.0"

RPM_NAME = "adios2-devel-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "2656b1a900bd0e154d35ca4c7b4462a7cdc003e1b19d12fc796777c69dda480fb5c8b376f9df7fe70b225d731635b0488d2535beb431c7c6e54a7b544904c483"

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
