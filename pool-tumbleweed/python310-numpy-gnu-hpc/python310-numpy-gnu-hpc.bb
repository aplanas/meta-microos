SUMMARY = "Dependency package for python310-numpy_1_24_2-gnu-hpc"
DESCRIPTION = "python310-numpy: NumPy array processing for numbers, strings, records and objects \
The package python310-numpy-gnu-hpc provides the dependency to get binary package python310-numpy_1_24_2-gnu-hpc. \
When this package gets updated it installs the latest version of python310-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python310-numpy-gnu-hpc-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "284f0e4a047aaf4be1d6600f2fc5c64b72b204f163890e035553ddecead994976ab18acf0f153d187ac11f14411b0a84ac0ced511aaa5a0708c39e6f55ec30af"

RPROVIDES:${PN} += "python310-numpy-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
python310-numpy-1-24-2-gnu-hpc"

inherit rpm
