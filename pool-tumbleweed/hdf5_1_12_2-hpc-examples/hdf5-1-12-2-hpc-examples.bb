SUMMARY = "Examples for hdf5_1_12_2-gnu-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides examples of HDF5 library use."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-hpc-examples-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "b018f8d89068715342d01a10a557a06756747aa52afda740e459172d8368f6aa3feb433c1d336745237a7443185955a64a6366247d42c05355deb7246170acb6"

RPROVIDES:${PN} += "hdf5_1_12_2-hpc-examples \
hdf5_1_12_2-hpc-examples(aarch-64)"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
