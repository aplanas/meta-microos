SUMMARY = "Microsoft Azure Orbital Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Orbital Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-orbital-2.0.0-1.2.noarch.rpm"
RPM_HASH = "323e684617a9c0adf97e08c0ab73c6f5b140eb3cc854c02c4756d0c82a2f737c8122bac3281465e5c1f18cc967dbd1b20b352e330c09ea45df306b297f6e22c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-orbital \
python39-azure-mgmt-orbital \
python3dist-azure-mgmt-orbital"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 if python39-base < 3.8 \
python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
