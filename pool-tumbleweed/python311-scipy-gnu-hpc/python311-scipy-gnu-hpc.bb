SUMMARY = "Dependency package for python311-scipy_1_10_1-gnu-hpc"
DESCRIPTION = "python311-scipy: Scientific Tools for Python \
The package python311-scipy-gnu-hpc provides the dependency to get binary package python311-scipy_1_10_1-gnu-hpc. \
When this package gets updated it installs the latest version of python311-scipy_1_10_1-gnu-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python311-scipy-gnu-hpc-1.10.1-2.4.aarch64.rpm"
RPM_HASH = "6530c326a5436668ad73b831ce34e4bd4f22962070d3c366f1ecb999f1315bcdc2b8c0170444904a3023276734851154d21d37a4fb271db49cb1f3193f4f81e6"

RPROVIDES:${PN} += "python311-scipy-gnu-hpc \
python311-scipy-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
python311-scipy_1_10_1-gnu-hpc"

inherit rpm
