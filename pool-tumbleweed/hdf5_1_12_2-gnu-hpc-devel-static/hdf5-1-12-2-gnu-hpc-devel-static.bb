SUMMARY = "Static development files for hdf5_1_12_2-gnu-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-hpc-devel-static-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "7ed3ab5998afe362b891b5f6f20b38dace38f71bdc42d5e4b31cfd5b885567593f59e1e08ca7e6e24e1c33025b96bca9b59ed860efb149a11da1dc423e73c849"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-hpc-devel-static"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-hpc-devel"

inherit rpm
