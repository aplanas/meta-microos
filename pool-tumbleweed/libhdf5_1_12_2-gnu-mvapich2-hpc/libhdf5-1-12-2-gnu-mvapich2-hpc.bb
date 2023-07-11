SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mvapich2-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_1_12_2-gnu-mvapich2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "b2551f337d736a0d43ba290bf71ea75f091484b1366ad793d5b4959c70d073702785419997bd578133f06cecfbcc1e3a461d74bac145eadcef76c5288318c5df"

RPROVIDES:${PN} += "libhdf5-1-12-2-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-mvapich2-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
