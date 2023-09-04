SUMMARY = "Dependency package for python310-numpy_1_25_2-gnu-hpc-devel"
DESCRIPTION = "python310-numpy: NumPy array processing for numbers, strings, records and objects \
The package python310-numpy-gnu-hpc-devel provides the dependency to get binary package python310-numpy_1_25_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of python310-numpy_1_25_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.25.2"

RPM_NAME = "python310-numpy-gnu-hpc-devel-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "fcc14d058d6ba4870e58d0aa1c6c9ec1de963b1e74a8aa105f9aeaf73830a7913b8c14e95d8f2157cddc38c932c04d7d1c28593ef5dfb2c8b60c5d58dc4d6975"

RPROVIDES:${PN} += "python310-numpy-gnu-hpc-devel"

RDEPENDS:${PN} += "python310-numpy-1-25-2-gnu-hpc-devel"

inherit rpm
