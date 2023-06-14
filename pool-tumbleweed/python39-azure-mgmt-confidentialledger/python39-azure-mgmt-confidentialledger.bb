SUMMARY = "Microsoft Azure Confidential Ledger Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Confidential Ledger Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-confidentialledger-1.0.0-1.5.noarch.rpm"
RPM_HASH = "aa0359712c50c00dca3d1b2f764f2fe7def3cf66775bca0f871f1277d5cdecef84dabf56c45750757948bc7ef7f6f2cb955bf331891fbd4e524e43644e6ae5bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-confidentialledger \
python39-azure-mgmt-confidentialledger \
python3dist-azure-mgmt-confidentialledger"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
