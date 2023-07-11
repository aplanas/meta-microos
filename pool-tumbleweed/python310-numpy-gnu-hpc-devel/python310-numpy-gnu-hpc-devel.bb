SUMMARY = "Dependency package for python310-numpy_1_24_2-gnu-hpc-devel"
DESCRIPTION = "python310-numpy: NumPy array processing for numbers, strings, records and objects \
The package python310-numpy-gnu-hpc-devel provides the dependency to get binary package python310-numpy_1_24_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of python310-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python310-numpy-gnu-hpc-devel-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "7bc54a14753f11bbd77174484a8f812908e5d509e126894c38f406ecc456b28b8cbf515ea704002a14772ed0ce4d051e9eb403482be5a7458b31ea3e88cee2ba"

RPROVIDES:${PN} += "python310-numpy-gnu-hpc-devel"

RDEPENDS:${PN} += "python310-numpy-1-24-2-gnu-hpc-devel"

inherit rpm
