SUMMARY = "Dependency package for python39-numpy_1_24_2-gnu-hpc-devel"
DESCRIPTION = "python39-numpy: NumPy array processing for numbers, strings, records and objects \
The package python39-numpy-gnu-hpc-devel provides the dependency to get binary package python39-numpy_1_24_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of python39-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python39-numpy-gnu-hpc-devel-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "5be221cb52f39b2606230783da75fd93d170a60fdc01abed134fdaa796585550da245918501919e4a91a5581770cfc8b5783af89b223c4f0ac77f978abb0d1b3"

RPROVIDES:${PN} += "python39-numpy-gnu-hpc-devel \
python39-numpy-gnu-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "python39-numpy_1_24_2-gnu-hpc-devel"

inherit rpm
