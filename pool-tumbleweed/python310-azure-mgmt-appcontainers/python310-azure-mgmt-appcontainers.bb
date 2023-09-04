SUMMARY = "Microsoft Azure Appcontainers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcontainers Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-azure-mgmt-appcontainers-3.0.0-1.1.noarch.rpm"
RPM_HASH = "9aa763a8a769e8e7885abaa0ffd792939d9861f3322274833bea7e5469f0a78c6327d43cde155f72f65774aa127363b67a382662aea5a397590fbe64d7823d33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-appcontainers \
python310-azure-mgmt-appcontainers \
python3dist-azure-mgmt-appcontainers"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
