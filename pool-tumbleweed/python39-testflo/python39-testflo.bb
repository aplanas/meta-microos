SUMMARY = "A flow-based testing framework"
DESCRIPTION = "This module provides a flow-based testing framework. testflo supports \
testing of the OpenMDAO framework. Some OpenMDAO features require \
execution under MPI, while others don't. testflo runs all of the \
authors' tests in the same way and allows them to build their tests \
using unittest.TestCase objects that they are familiar with."
LICENSE = "Apache-2.0"

PV = "1.4.9"

RPM_NAME = "python39-testflo-1.4.9-2.4.noarch.rpm"
RPM_HASH = "752b99b8265f6835193c0fdbc0affa88b38ee5772fa2e11d1f1e32dd1de27b1479d482f14dc49aa60566850201b6ee7353eae6de67a7c122c0f6cfba784de1ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(testflo) \
python39-testflo \
python3dist(testflo)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-setuptools \
update-alternatives"

inherit rpm
