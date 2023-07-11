SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi3 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl200-openmpi3-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "551c5a18a53729571593adad4dcfb11667539c7d89c3d7d98e3bb68aa5c41aa4397f40ed06adbaed23e18a3cfc0174123f695c4661c16dc63cdabda713f573a1"

RPROVIDES:${PN} += "libhdf5-hl-openmpi3 \
libhdf5-hl.so.200 \
libhdf5-hl200-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200"

inherit rpm
