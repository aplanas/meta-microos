SUMMARY = "Development files for hdf5_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi1-hpc-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "5cdb7de0550261d36f96a1938f608febdb32385a651c5b8b61d1caf6a2c0585c76e375fcef5a98e586571f1383385b2446e06d4a890119a4d3e38b823297939b"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-1-12-2-gnu-openmpi1-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5-1-12-2-gnu-openmpi1-hpc \
libhdf5-cpp-1-12-2-gnu-openmpi1-hpc \
libhdf5-fortran-1-12-2-gnu-openmpi1-hpc \
libhdf5-hl-1-12-2-gnu-openmpi1-hpc \
libhdf5-hl-cpp-1-12-2-gnu-openmpi1-hpc \
libhdf5hl-fortran-1-12-2-gnu-openmpi1-hpc \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
openmpi1-gnu-hpc-devel \
zlib-devel"

inherit rpm
