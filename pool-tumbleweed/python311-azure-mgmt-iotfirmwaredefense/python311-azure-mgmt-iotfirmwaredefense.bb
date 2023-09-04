SUMMARY = "Microsoft Azure Iotfirmwaredefense Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Iotfirmwaredefense Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-iotfirmwaredefense-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "5de2b39b971bcfe534f8f347746b2f8111ff4b710bfd23e0dea68f5fafd55f711411fa1940c0164eaf308fb792bfc5e07672c626f21c94ebf115078c0b67f129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-iotfirmwaredefense \
python3.11dist-azure-mgmt-iotfirmwaredefense \
python311-azure-mgmt-iotfirmwaredefense \
python3dist-azure-mgmt-iotfirmwaredefense"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
