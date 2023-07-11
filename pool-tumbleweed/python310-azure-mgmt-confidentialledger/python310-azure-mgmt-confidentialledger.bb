SUMMARY = "Microsoft Azure Confidential Ledger Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Confidential Ledger Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-confidentialledger-1.0.0-1.6.noarch.rpm"
RPM_HASH = "efcba777d6839fffb7864ba95165a79f8b488938ee2b440837eb71505ae604a9951fa15802b1e8c5af5135c2e0d77d7cc1a3f3266a9cd4e0846d2765af979b39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-confidentialledger \
python310-azure-mgmt-confidentialledger \
python3dist-azure-mgmt-confidentialledger"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
