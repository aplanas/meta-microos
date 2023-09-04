SUMMARY = "Dependency package for python310-scipy_1_11_1-gnu-hpc"
DESCRIPTION = "python310-scipy: Scientific Tools for Python \
The package python310-scipy-gnu-hpc provides the dependency to get binary package python310-scipy_1_11_1-gnu-hpc. \
When this package gets updated it installs the latest version of python310-scipy_1_11_1-gnu-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.11.1"

RPM_NAME = "python310-scipy-gnu-hpc-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "113308fdf13ef8e03a28ed521b599886e2bec6017fe556b75d4045e70682c3ec1a38d4836e6cc9abfe6e3ac05db4ad26c636ad12b55b93001d9cf1c67d5a1a7c"

RPROVIDES:${PN} += "python310-scipy-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
python310-scipy-1-11-1-gnu-hpc"

inherit rpm
