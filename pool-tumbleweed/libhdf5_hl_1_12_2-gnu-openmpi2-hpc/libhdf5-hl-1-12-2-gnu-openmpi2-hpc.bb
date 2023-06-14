SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi2-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_1_12_2-gnu-openmpi2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "8293b249cd97f4f12f45e88c3c7eff010f34f734ef59ac982e76851614eb55bc433ddd4b2f6a60c2520b2ac8a0c104202c79da700b82e2aab8ad230dbef81b9c"

RPROVIDES:${PN} += "libhdf5-hl-1-12-2-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi2-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
