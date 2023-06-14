SUMMARY = "Microsoft Azure Azureadb2c Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azureadb2c Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-mgmt-azureadb2c-1.0.0b1-1.11.noarch.rpm"
RPM_HASH = "6d8014f6ac57a606ebc7bdd616c41d16d704b31a0897bdcea81332ee65d277103b79ee0a4460070ce5b91358d992ad59f9360c77b652b79ee85b94e7edd1d5cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-azureadb2c \
python3.10dist-azure-mgmt-azureadb2c \
python310-azure-mgmt-azureadb2c \
python3dist-azure-mgmt-azureadb2c"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
