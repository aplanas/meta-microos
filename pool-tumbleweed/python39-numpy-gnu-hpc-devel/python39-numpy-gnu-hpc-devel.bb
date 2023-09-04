SUMMARY = "Dependency package for python39-numpy_1_25_2-gnu-hpc-devel"
DESCRIPTION = "python39-numpy: NumPy array processing for numbers, strings, records and objects \
The package python39-numpy-gnu-hpc-devel provides the dependency to get binary package python39-numpy_1_25_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of python39-numpy_1_25_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.25.2"

RPM_NAME = "python39-numpy-gnu-hpc-devel-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "056d93a123e2dd95d28c880513f863321854aa6afd921d153784c099e6885c0f07f6fbcae378eb379b78de1c6ed76a2fafa2c9c757adf8a6e6646df55e42e735"

RPROVIDES:${PN} += "python39-numpy-gnu-hpc-devel"

RDEPENDS:${PN} += "python39-numpy-1-25-2-gnu-hpc-devel"

inherit rpm
