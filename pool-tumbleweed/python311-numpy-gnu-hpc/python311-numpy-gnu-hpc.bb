SUMMARY = "Dependency package for python311-numpy_1_24_2-gnu-hpc"
DESCRIPTION = "python311-numpy: NumPy array processing for numbers, strings, records and objects \
The package python311-numpy-gnu-hpc provides the dependency to get binary package python311-numpy_1_24_2-gnu-hpc. \
When this package gets updated it installs the latest version of python311-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python311-numpy-gnu-hpc-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "bcf281d476a3ef8fbc379df5857f8db3bb3d1b63b93e245ee2fb71e6b7c3e12d29959ec51d1cb7ad67955b347d12188c7b3164b0459bf34c4ffe266d110489c6"

RPROVIDES:${PN} += "python3-numpy-gnu-hpc \
python311-numpy-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
python311-numpy-1-24-2-gnu-hpc"

inherit rpm
