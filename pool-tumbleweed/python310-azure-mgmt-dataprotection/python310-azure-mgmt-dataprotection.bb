SUMMARY = "Microsoft Azure Dataprotection Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dataprotection Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-azure-mgmt-dataprotection-1.2.0-1.1.noarch.rpm"
RPM_HASH = "88e2769d9bb23c9d9cb754cc6a9115f0fe2e59742a6f6ebb08e52a67f8da88fca4dda32f36e33f868bcd961342fbf53b424ff28edb6f79c9fdee914f0a537ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-dataprotection \
python310-azure-mgmt-dataprotection \
python3dist-azure-mgmt-dataprotection"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
