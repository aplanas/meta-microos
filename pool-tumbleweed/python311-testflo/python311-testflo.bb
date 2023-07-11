SUMMARY = "A flow-based testing framework"
DESCRIPTION = "This module provides a flow-based testing framework. testflo supports \
testing of the OpenMDAO framework. Some OpenMDAO features require \
execution under MPI, while others don't. testflo runs all of the \
authors' tests in the same way and allows them to build their tests \
using unittest.TestCase objects that they are familiar with."
LICENSE = "Apache-2.0"

PV = "1.4.9"

RPM_NAME = "python311-testflo-1.4.9-2.6.noarch.rpm"
RPM_HASH = "848c9a6d104edba1d076b5482fada14e598e4b1076012b72578feb70d5460fff0efbc19eff9a4933f27a2b4d8ea33300c8221a086c3f488794b2df4de7379c13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testflo \
python3.11dist-testflo \
python311-testflo \
python3dist-testflo"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
