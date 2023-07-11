SUMMARY = "Microsoft Azure Desktop Virtualization Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Desktop Virtualization Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-desktopvirtualization-1.0.0-1.3.noarch.rpm"
RPM_HASH = "990294a6fd84857d294a6ee1830e24abae91115f0c8762d15870019b822aad9cd80c4b5f8d135f09b4d6d4eb2438486aeb77064cf154b851a4e2154f74aefb6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-desktopvirtualization \
python310-azure-mgmt-desktopvirtualization \
python3dist-azure-mgmt-desktopvirtualization"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
