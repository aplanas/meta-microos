SUMMARY = "Microsoft Azure Dnsresolver Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dnsresolver Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-dnsresolver-1.0.0-1.4.noarch.rpm"
RPM_HASH = "84ec3e22d25a0c4004a956fc763b67c45747c858633976a083c77fa1ff96f8df22d4f36dfe440a89d422c5853bae816bcbf6d2730142d0276a9e7726b25ffc99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-dnsresolver \
python310-azure-mgmt-dnsresolver \
python3dist-azure-mgmt-dnsresolver"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
