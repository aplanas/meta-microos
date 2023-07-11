SUMMARY = "Microsoft Azure Communication Identity Service Client Library for Python"
DESCRIPTION = "Azure Communication Identity client package is intended to be used to setup the basics for opening a \
way to use Azure Communication Service offerings. This package helps to create identity user tokens \
to be used by other client packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python310-azure-communication-identity-1.3.1-1.5.noarch.rpm"
RPM_HASH = "23285b6c102e45df59e5b219512adb67bdbe3ca70be9f92833a542e8c09c92cf71b6966993b5d097cc932bf3a22e5920be81832699f51ffffdcf14d68146147b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-communication-identity \
python310-azure-communication-identity \
python3dist-azure-communication-identity"

RDEPENDS:${PN} += "python-abi \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest \
python310-six"

inherit rpm
