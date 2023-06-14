SUMMARY = "Python tool to find and list requirements of a Python project"
DESCRIPTION = "Requirements-detector is a Python tool which attempts to find and list \
the requirements of a Python project. \
 \
When run from the root of a Python project, it will try to ascertain \
which libraries and the versions of those libraries that the project \
depends on."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python311-requirements-detector-0.7-2.11.noarch.rpm"
RPM_HASH = "75331564880914843f97c7c98557763be31777c989d927295a0e0aeff09433d6becb06bfa1c8ea32d83fac4866408214778b70ec5d3951fc80a66d925c3d8d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-requirements-detector \
python311-requirements-detector \
python3dist-requirements-detector"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-astroid \
update-alternatives"

inherit rpm
