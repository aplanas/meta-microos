SUMMARY = "Static development files for hdf5-openmpi1"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the openmpi1 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi1-devel-static-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "a46962557ffe332dc25fc26d95f99229ec42431f9a71adfeeca599c8fca90eea47ff81f7ef3788a149b133877910f299d44804dcfe312f0622096c6dca7c2a67"

RPROVIDES:${PN} += "hdf5-openmpi1-devel-static"

RDEPENDS:${PN} += "hdf5-openmpi1-devel"

inherit rpm
