SUMMARY = "Microsoft Azure Mobilenetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mobilenetwork Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-mobilenetwork-2.0.0-1.4.noarch.rpm"
RPM_HASH = "153e2caee6af1fcca3dc4b6adc941e7a1c459e5cd37dd79c4d932453cce01e94c2fb96756d92b86e9e29d7d0ab64cfcb97d7d90355ac8e711555620f409708a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-mobilenetwork \
python3.11dist-azure-mgmt-mobilenetwork \
python311-azure-mgmt-mobilenetwork \
python3dist-azure-mgmt-mobilenetwork"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
