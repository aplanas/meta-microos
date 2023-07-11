SUMMARY = "Dependency package for hdf5_1_12_2-hpc-examples"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-hpc-examples provides the dependency to get binary package hdf5_1_12_2-hpc-examples. \
When this package gets updated it installs the latest version of hdf5_1_12_2-hpc-examples."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-hpc-examples-1.12.2-5.3.noarch.rpm"
RPM_HASH = "af8349335924a2c2f47e6137c12b4f9f9084de1fc9d9c1696ab436e8088b9f7a0c19376c2c1023856180cae88008684660692edcbdd8a954b9553199780f61a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-hpc-examples"

RDEPENDS:${PN} += "hdf5-1-12-2-hpc-examples"

inherit rpm
