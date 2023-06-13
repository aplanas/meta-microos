SUMMARY = "Microsoft Azure Mobilenetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mobilenetwork Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-mobilenetwork-2.0.0-1.3.noarch.rpm"
RPM_HASH = "c0bfb3f5a7eb9962caa91db2fcb217a872d87a9f9a6b38bb51a801e72070cb3386f7ee40a09439a6e76c044d6d3125ef53967508821670c106b761defafd8ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-mobilenetwork \
python3.10dist(azure-mgmt-mobilenetwork) \
python310-azure-mgmt-mobilenetwork \
python3dist(azure-mgmt-mobilenetwork)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
