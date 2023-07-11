SUMMARY = "Examples for hdf5"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides examples of HDF5 library use."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-examples-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "3cf035fa31d37aaf3f3239163e91e4bfb8028348f380be5c4ffc65a01794a1277c133e741f0a580c10f68d59666dfb2f08988359adbcb4b589ed63d7ec23eba4"

RPROVIDES:${PN} += "hdf5-examples"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
