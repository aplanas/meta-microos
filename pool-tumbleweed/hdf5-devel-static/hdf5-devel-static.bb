SUMMARY = "Static development files for hdf5"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the serial version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-devel-static-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "2fadf5f54d9ea7483ddd1cca8d7983ba467478778d9b3f17a507048c359339ce5fa60a53d4a2881a1cb5bcbace50d4f794969906ebddf4befeb24600a20ce882"

RPROVIDES:${PN} += "hdf5-devel-static"

RDEPENDS:${PN} += "hdf5-devel"

inherit rpm
