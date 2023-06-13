SUMMARY = "Dependency package for python310-numpy_1_24_2-gnu-hpc"
DESCRIPTION = "python310-numpy: NumPy array processing for numbers, strings, records and objects \
The package python310-numpy-gnu-hpc provides the dependency to get binary package python310-numpy_1_24_2-gnu-hpc. \
When this package gets updated it installs the latest version of python310-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python310-numpy-gnu-hpc-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "7b093ea464c84bdca8a867017cb3e01c31f15ade77492f5dd939775fe0de7240bff3eaf8bfb2895597715cf1ff494da753796a22566cb08a3c8629514b54de28"

RPROVIDES:${PN} += "python3-numpy-gnu-hpc \
python310-numpy-gnu-hpc \
python310-numpy-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
python310-numpy_1_24_2-gnu-hpc"

inherit rpm
