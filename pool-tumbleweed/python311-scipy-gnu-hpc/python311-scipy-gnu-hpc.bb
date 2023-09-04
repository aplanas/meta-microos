SUMMARY = "Dependency package for python311-scipy_1_11_1-gnu-hpc"
DESCRIPTION = "python311-scipy: Scientific Tools for Python \
The package python311-scipy-gnu-hpc provides the dependency to get binary package python311-scipy_1_11_1-gnu-hpc. \
When this package gets updated it installs the latest version of python311-scipy_1_11_1-gnu-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.11.1"

RPM_NAME = "python311-scipy-gnu-hpc-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "39a609aa343649d8c7d00624f241bf7b4b0acdb039eade527b3239fdfbd0cb3c18e530037a9ead2d9ba18641c1654346882afbfdaff20d47b647476f4bfdff60"

RPROVIDES:${PN} += "python3-scipy-gnu-hpc \
python311-scipy-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
python311-scipy-1-11-1-gnu-hpc"

inherit rpm
