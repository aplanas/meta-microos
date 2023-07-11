SUMMARY = "Development data files for hdf5"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains generic files needed to create projects that use \
any version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-devel-data-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "fa34618e32514ac6012c7d654f468d5dbbcf5ef4f46dffb5d4bb49a0ca10119b77fa5b75266afcaad9e119762252a29d659a12bfb8addc8034694d9771db83ad"

RPROVIDES:${PN} += "hdf5-devel-data \
rpm-macro--hdf5-sonum \
rpm-macro--hdf5-version"

RDEPENDS:${PN} += ""

inherit rpm
