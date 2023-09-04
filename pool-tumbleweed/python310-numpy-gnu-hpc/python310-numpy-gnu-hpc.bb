SUMMARY = "Dependency package for python310-numpy_1_25_2-gnu-hpc"
DESCRIPTION = "python310-numpy: NumPy array processing for numbers, strings, records and objects \
The package python310-numpy-gnu-hpc provides the dependency to get binary package python310-numpy_1_25_2-gnu-hpc. \
When this package gets updated it installs the latest version of python310-numpy_1_25_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.25.2"

RPM_NAME = "python310-numpy-gnu-hpc-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "09e993a8b99ca8742500946ce8ddedd627c32326de812f17d261f11399a04b493c5a74909b29a0533ab2710c26417e1c5be7af6b652dfddb7f7b2ae435e9c7ac"

RPROVIDES:${PN} += "python310-numpy-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
python310-numpy-1-25-2-gnu-hpc"

inherit rpm
