SUMMARY = "Microsoft Azure Support Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Support Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python310-azure-mgmt-support-6.0.0.0-1.8.noarch.rpm"
RPM_HASH = "768eb53ba436788352341da208ae424b732fee290fafedfe719bf88c674211ee9eb4cf026d551ea83d9e9631f638bfe720b7ecdc40f87a9affcea081f9017dd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-support \
python3.10dist(azure-mgmt-support) \
python310-azure-mgmt-support \
python3dist(azure-mgmt-support)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
