SUMMARY = "Microsoft Azure Support Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Support Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python311-azure-mgmt-support-6.0.0.0-1.9.noarch.rpm"
RPM_HASH = "f64f74a0a6acacd5066472e0475a3472a5ac4b346e11f1518a0d520f85d7eb39646ce0e384d0c38ef9d754fe240ba174ee0adce63da3251385907861cf1caecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-support \
python3.11dist-azure-mgmt-support \
python311-azure-mgmt-support \
python3dist-azure-mgmt-support"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
