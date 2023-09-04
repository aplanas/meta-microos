SUMMARY = "Dependency package for python311-numpy_1_25_2-gnu-hpc-devel"
DESCRIPTION = "python311-numpy: NumPy array processing for numbers, strings, records and objects \
The package python311-numpy-gnu-hpc-devel provides the dependency to get binary package python311-numpy_1_25_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of python311-numpy_1_25_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.25.2"

RPM_NAME = "python311-numpy-gnu-hpc-devel-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "744b06a1005d5f47225fd3bfaaa30dd450fc359b9cce5eddc321a2aab9cf1935b953d6bc5c7ba6691dad2d5179d5215ea4e4af659356f2a130df7cadb15608e7"

RPROVIDES:${PN} += "python3-numpy-gnu-hpc-devel \
python311-numpy-gnu-hpc-devel"

RDEPENDS:${PN} += "python311-numpy-1-25-2-gnu-hpc-devel"

inherit rpm
