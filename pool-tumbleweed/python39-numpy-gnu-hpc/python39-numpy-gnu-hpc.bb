SUMMARY = "Dependency package for python39-numpy_1_24_2-gnu-hpc"
DESCRIPTION = "python39-numpy: NumPy array processing for numbers, strings, records and objects \
The package python39-numpy-gnu-hpc provides the dependency to get binary package python39-numpy_1_24_2-gnu-hpc. \
When this package gets updated it installs the latest version of python39-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python39-numpy-gnu-hpc-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "dfe3ae706b171498b3c608f229d8dcba8ebef73fbe9d0226dd55cbe1f03c72a16359b40176c42b0a8033399e045f6735048c77d0a90138a88de1cbb71b3a459e"

RPROVIDES:${PN} += "python39-numpy-gnu-hpc \
python39-numpy-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
python39-numpy_1_24_2-gnu-hpc"

inherit rpm
