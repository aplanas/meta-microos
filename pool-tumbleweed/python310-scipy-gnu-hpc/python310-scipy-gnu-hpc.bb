SUMMARY = "Dependency package for python310-scipy_1_10_1-gnu-hpc"
DESCRIPTION = "python310-scipy: Scientific Tools for Python \
The package python310-scipy-gnu-hpc provides the dependency to get binary package python310-scipy_1_10_1-gnu-hpc. \
When this package gets updated it installs the latest version of python310-scipy_1_10_1-gnu-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python310-scipy-gnu-hpc-1.10.1-3.1.aarch64.rpm"
RPM_HASH = "a094be2c5bcf8cacb0c89035a3ed9077cf7a58f76f50a42671cf5060a0cc896a60d76720d0e5a4290834bb2f7e1f46a447c34eea28ead8560dd714f799a645f7"

RPROVIDES:${PN} += "python310-scipy-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
python310-scipy-1-10-1-gnu-hpc"

inherit rpm
