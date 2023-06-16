SUMMARY = "Dependency package for python311-numpy_1_24_2-gnu-hpc"
DESCRIPTION = "python311-numpy: NumPy array processing for numbers, strings, records and objects \
The package python311-numpy-gnu-hpc provides the dependency to get binary package python311-numpy_1_24_2-gnu-hpc. \
When this package gets updated it installs the latest version of python311-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python311-numpy-gnu-hpc-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "867813e23fc65c1b2ab4679ce2b9cadae024b5344abf796753fb0e7b36c0372db298fd519c82d94d18553e847214866de39f179d2783758b20ac7bf771b36fb5"

RPROVIDES:${PN} += "python311-numpy-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
python311-numpy-1-24-2-gnu-hpc"

inherit rpm
