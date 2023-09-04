SUMMARY = "Dependency package for python39-scipy_1_11_1-gnu-hpc"
DESCRIPTION = "python39-scipy: Scientific Tools for Python \
The package python39-scipy-gnu-hpc provides the dependency to get binary package python39-scipy_1_11_1-gnu-hpc. \
When this package gets updated it installs the latest version of python39-scipy_1_11_1-gnu-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.11.1"

RPM_NAME = "python39-scipy-gnu-hpc-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "1b4ad9dda136e9612ac5f5fd0be51e843570dd9caef8407d01929854e6d6e89413e7f31e09562f98f6045c72282b95fac8cc9f9ff1f319969288fd2071315eda"

RPROVIDES:${PN} += "python39-scipy-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
python39-scipy-1-11-1-gnu-hpc"

inherit rpm
