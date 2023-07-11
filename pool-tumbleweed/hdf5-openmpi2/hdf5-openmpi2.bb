SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi2 version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "3a6de360cfd8145e5896360a8df39fe2713790900209c679a701c0c9d28dc511e6c49647d8648b2773544c1f42977c06ba65c8cb4d1fd16b86aa798e89498a23"

RPROVIDES:${PN} += "hdf5-openmpi2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-200 \
libhdf5-fortran200 \
libhdf5-hl200 \
libhdf5.so.200 \
libhdf5hl-fortran200 \
libm.so.6 \
libmpi.so.20"

inherit rpm
