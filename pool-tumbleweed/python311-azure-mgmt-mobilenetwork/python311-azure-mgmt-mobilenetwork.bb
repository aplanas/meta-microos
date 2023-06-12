SUMMARY = "Microsoft Azure Mobilenetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mobilenetwork Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-mobilenetwork-2.0.0-1.3.noarch.rpm"
RPM_HASH = "2d4968005f240b7da53c51d6ad76d69fc3e878a698a51d4e1652c6bbbde8885ca5c8e4148e9835fe0bdaa9622de971ca1ebf79d773a02b05550216fd1fd2bbc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-mobilenetwork) \
python311-azure-mgmt-mobilenetwork \
python3dist(azure-mgmt-mobilenetwork)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
