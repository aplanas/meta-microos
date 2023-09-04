SUMMARY = "Dependency package for python39-numpy_1_25_2-gnu-hpc"
DESCRIPTION = "python39-numpy: NumPy array processing for numbers, strings, records and objects \
The package python39-numpy-gnu-hpc provides the dependency to get binary package python39-numpy_1_25_2-gnu-hpc. \
When this package gets updated it installs the latest version of python39-numpy_1_25_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.25.2"

RPM_NAME = "python39-numpy-gnu-hpc-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "d513461e6c4c27c443d3a50dfbf0e725a8bd0bcfbfd5780739f49eac3a8d366bda0fd4443d178327da63f4a73783c8255ed2c0c6e6223f1cd345f6b041a94b46"

RPROVIDES:${PN} += "python39-numpy-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
python39-numpy-1-25-2-gnu-hpc"

inherit rpm
