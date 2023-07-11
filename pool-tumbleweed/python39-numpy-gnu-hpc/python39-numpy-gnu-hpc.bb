SUMMARY = "Dependency package for python39-numpy_1_24_2-gnu-hpc"
DESCRIPTION = "python39-numpy: NumPy array processing for numbers, strings, records and objects \
The package python39-numpy-gnu-hpc provides the dependency to get binary package python39-numpy_1_24_2-gnu-hpc. \
When this package gets updated it installs the latest version of python39-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python39-numpy-gnu-hpc-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "a1f6d02d1bed43640c6f3988b32ec836ce4301045af721ee2029b3a987fc6e718d5cd7a587dd6d8866e3137f9bd8e0ae4b4698e57da6490c009492994fd0b3db"

RPROVIDES:${PN} += "python39-numpy-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
python39-numpy-1-24-2-gnu-hpc"

inherit rpm
