SUMMARY = "A flow-based testing framework"
DESCRIPTION = "This module provides a flow-based testing framework. testflo supports \
testing of the OpenMDAO framework. Some OpenMDAO features require \
execution under MPI, while others don't. testflo runs all of the \
authors' tests in the same way and allows them to build their tests \
using unittest.TestCase objects that they are familiar with."
LICENSE = "Apache-2.0"

PV = "1.4.9"

RPM_NAME = "python310-testflo-1.4.9-2.6.noarch.rpm"
RPM_HASH = "28ed65de7ffaf649a4aed0bae0f0cc9f256bcc08b7cd53ec213f1b753e14c7e0e70fca3654202c8f311a74c186c4066f2f3e32534541e5eb5998da946268b2bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-testflo \
python310-testflo \
python3dist-testflo"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
