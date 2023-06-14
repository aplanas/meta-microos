SUMMARY = "Microsoft Azure Qumulo Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Qumulo Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-qumulo-1.0.0-1.1.noarch.rpm"
RPM_HASH = "a410517b9af2e0dbacbf2609b72251d527bc06139a4da07c63a241a92a2fba1950562f0a69300b7fa8cca5c2d8ecbdd10dea5c96d8f1b2ce401925e58206c447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-qumulo \
python39-azure-mgmt-qumulo \
python3dist-azure-mgmt-qumulo"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
