SUMMARY = "Dependency package for python310-numpy_1_24_2-gnu-hpc-devel"
DESCRIPTION = "python310-numpy: NumPy array processing for numbers, strings, records and objects \
The package python310-numpy-gnu-hpc-devel provides the dependency to get binary package python310-numpy_1_24_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of python310-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python310-numpy-gnu-hpc-devel-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "e18224ea6a43b19a361e2d1726dd4f6351a425b4948bc7741e6465c42b294ad92f055a9b8fcef502c8ae56c482aee1f6a97e3039adc4f16ad45c3a4c40f8e12d"

RPROVIDES:${PN} += "python3-numpy-gnu-hpc-devel \
python310-numpy-gnu-hpc-devel \
python310-numpy-gnu-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "python310-numpy_1_24_2-gnu-hpc-devel"

inherit rpm
