SUMMARY = "Microsoft Azure Dynatrace Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dynatrace Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-dynatrace-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "b74e191a915b3987b52bc9b1f2a1bff4815fae6729b4ad1ced00f8f3f86bb731082632a138ec056658446a8efde782230781f2d28b0774ada663af7e67015d97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dynatrace \
python3.11dist-azure-mgmt-dynatrace \
python311-azure-mgmt-dynatrace \
python3dist-azure-mgmt-dynatrace"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
