SUMMARY = "Static development files for hdf5-mvapich2"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the mvapich2 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-mvapich2-devel-static-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "3b891ac4a33592d113c56e9f7791d9d2cfc4b15b7b73f81ad3215704746c866ec8853b9535e94604f13bf6633f20beea5efa36c4b77f52cb0ff7dbfbbc671d63"

RPROVIDES:${PN} += "hdf5-mvapich2-devel-static"

RDEPENDS:${PN} += "hdf5-mvapich2-devel"

inherit rpm
