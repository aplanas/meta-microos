SUMMARY = "Dependency package for python39-numpy_1_24_2-gnu-hpc-devel"
DESCRIPTION = "python39-numpy: NumPy array processing for numbers, strings, records and objects \
The package python39-numpy-gnu-hpc-devel provides the dependency to get binary package python39-numpy_1_24_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of python39-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python39-numpy-gnu-hpc-devel-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "a00d68ef2050aafe863e01bce33e559df3035fedefab6d8e4a772bdb947b8e784dd550e935b77d5dceb9df432e1bbcbd22ec02d90cf2852d55a39cdc8b42b10a"

RPROVIDES:${PN} += "python39-numpy-gnu-hpc-devel"

RDEPENDS:${PN} += "python39-numpy-1-24-2-gnu-hpc-devel"

inherit rpm
