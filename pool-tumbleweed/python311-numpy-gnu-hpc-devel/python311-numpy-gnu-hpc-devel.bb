SUMMARY = "Dependency package for python311-numpy_1_24_2-gnu-hpc-devel"
DESCRIPTION = "python311-numpy: NumPy array processing for numbers, strings, records and objects \
The package python311-numpy-gnu-hpc-devel provides the dependency to get binary package python311-numpy_1_24_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of python311-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python311-numpy-gnu-hpc-devel-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "0d6c0051c18f4c83c68dc51f0da421fd723ce21f283759fd47a3245d850eb8df0cb1c05114e19fefc839a580561bf07d4f1b3b0fd505b4d5e037630ec20fd345"

RPROVIDES:${PN} += "python3-numpy-gnu-hpc-devel \
python311-numpy-gnu-hpc-devel"

RDEPENDS:${PN} += "python311-numpy-1-24-2-gnu-hpc-devel"

inherit rpm
