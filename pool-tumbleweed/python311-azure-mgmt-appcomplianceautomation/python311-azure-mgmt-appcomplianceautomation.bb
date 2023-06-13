SUMMARY = "Microsoft Azure Appcomplianceautomation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcomplianceautomation Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-appcomplianceautomation-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "05e22b66ddc7c1b0b4d043d1c16f524157bc650dbba77b0375d54d6943f26fe5e1d9a79088fcc78d75ebeeeccaaa791a3e7c6cf5f6cf91935cbeae34d935ce0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-appcomplianceautomation) \
python311-azure-mgmt-appcomplianceautomation \
python3dist(azure-mgmt-appcomplianceautomation)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
