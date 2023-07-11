SUMMARY = "Microsoft Azure Servicelinker Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicelinker Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.2.0~b1"

RPM_NAME = "python39-azure-mgmt-servicelinker-1.2.0~b1-1.4.noarch.rpm"
RPM_HASH = "2ad3f1d716dc75a19e74018f953e0bd9b4a4db5c2af4bf25fee09c361355c4e87c0151cc25d5f77c96cff715776cf7d6fd75940b935472876c5764550d266a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-servicelinker \
python39-azure-mgmt-servicelinker \
python3dist-azure-mgmt-servicelinker"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
