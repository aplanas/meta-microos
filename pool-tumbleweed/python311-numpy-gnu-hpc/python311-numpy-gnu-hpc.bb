SUMMARY = "Dependency package for python311-numpy_1_25_2-gnu-hpc"
DESCRIPTION = "python311-numpy: NumPy array processing for numbers, strings, records and objects \
The package python311-numpy-gnu-hpc provides the dependency to get binary package python311-numpy_1_25_2-gnu-hpc. \
When this package gets updated it installs the latest version of python311-numpy_1_25_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.25.2"

RPM_NAME = "python311-numpy-gnu-hpc-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "492e11a6226731cd5a2bc62971ec777adc2fa4c9f26b4ddbdc56d04c5bedb7d209517c7d4f8864031e9a169ffb4a254b6deb8f9d2ac5e1d4ac6877acf426652c"

RPROVIDES:${PN} += "python3-numpy-gnu-hpc \
python311-numpy-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
python311-numpy-1-25-2-gnu-hpc"

inherit rpm
