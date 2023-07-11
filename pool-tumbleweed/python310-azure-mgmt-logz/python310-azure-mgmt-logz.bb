SUMMARY = "Microsoft Azure Logz Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Logz Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-logz-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "bcad4734652a5e518b60d61a78960c2dca7536cc0e39394c88d1fdc02b6f2e6b28abcc1a2574b761ed3ac6e75dce9c9dc3f928b276bb7acead08d2f64de05765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-logz \
python310-azure-mgmt-logz \
python3dist-azure-mgmt-logz"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
