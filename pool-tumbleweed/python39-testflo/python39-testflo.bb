SUMMARY = "A flow-based testing framework"
DESCRIPTION = "This module provides a flow-based testing framework. testflo supports \
testing of the OpenMDAO framework. Some OpenMDAO features require \
execution under MPI, while others don't. testflo runs all of the \
authors' tests in the same way and allows them to build their tests \
using unittest.TestCase objects that they are familiar with."
LICENSE = "Apache-2.0"

PV = "1.4.9"

RPM_NAME = "python39-testflo-1.4.9-2.6.noarch.rpm"
RPM_HASH = "f5a387bc319e57f8c1edde5d3b3724e47e08d98d75bd1fed6e539a562b607178155fa04262338d4ce9bd8d0d65fb9a635b8ac14779db16abaafb9edfc3bbf193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-testflo \
python39-testflo \
python3dist-testflo"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
