SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi1 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl200-openmpi1-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "69bd46078106328f3f806dd1d182d22b717eff2324accfa25e4b96096d97aef6d4532de7f09cd12cdbead29f03f20e542f20aed725544c9b2a501e45c840d850"

RPROVIDES:${PN} += "libhdf5_hl-openmpi1 \
libhdf5_hl.so.200()(64bit) \
libhdf5_hl200-openmpi1 \
libhdf5_hl200-openmpi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhdf5.so.200()(64bit)"

inherit rpm