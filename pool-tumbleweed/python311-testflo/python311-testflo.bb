SUMMARY = "A flow-based testing framework"
DESCRIPTION = "This module provides a flow-based testing framework. testflo supports \
testing of the OpenMDAO framework. Some OpenMDAO features require \
execution under MPI, while others don't. testflo runs all of the \
authors' tests in the same way and allows them to build their tests \
using unittest.TestCase objects that they are familiar with."
LICENSE = "Apache-2.0"

PV = "1.4.9"

RPM_NAME = "python311-testflo-1.4.9-2.4.noarch.rpm"
RPM_HASH = "70e818ab5b3f74e0999accf28f5d8d351c5f8ab069c772206c370b90b146a95cddc5cbbd0a0d379389c95f9e3b78c06a0012de27e1223d48999ac054706db88a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(testflo) \
python311-testflo \
python3dist(testflo)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
