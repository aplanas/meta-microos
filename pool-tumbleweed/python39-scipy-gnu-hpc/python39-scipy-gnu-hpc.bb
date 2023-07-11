SUMMARY = "Dependency package for python39-scipy_1_10_1-gnu-hpc"
DESCRIPTION = "python39-scipy: Scientific Tools for Python \
The package python39-scipy-gnu-hpc provides the dependency to get binary package python39-scipy_1_10_1-gnu-hpc. \
When this package gets updated it installs the latest version of python39-scipy_1_10_1-gnu-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python39-scipy-gnu-hpc-1.10.1-3.1.aarch64.rpm"
RPM_HASH = "18de3862e4f10660a456052224c594477852096ca5e93c30470b91ca777b7f7e204e9700ccc0c9772a866a0c89fcbb620dc2105ef97d81f229b0a53eac629e82"

RPROVIDES:${PN} += "python39-scipy-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
python39-scipy-1-10-1-gnu-hpc"

inherit rpm
