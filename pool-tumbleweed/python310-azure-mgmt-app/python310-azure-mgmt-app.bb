SUMMARY = "Microsoft Azure App Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure App Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-app-1.0.0b2-1.6.noarch.rpm"
RPM_HASH = "bcccc16cf49cfe17f7ab470f311ff0b60c78fcd0096b363ebfadcd683d9a11457f97ecba9b176326df96fd5d3537eb257904a10bd1b23c56e55b1d82a1e3ac7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-app \
python310-azure-mgmt-app \
python3dist-azure-mgmt-app"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
