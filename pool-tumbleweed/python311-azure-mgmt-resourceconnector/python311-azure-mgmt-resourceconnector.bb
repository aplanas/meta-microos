SUMMARY = "Microsoft Azure Resourceconnector Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resourceconnector Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-resourceconnector-1.0.0.0-1.1.noarch.rpm"
RPM_HASH = "75fa5fd8147433fa4624fc9182457a609b622039b41dae84362bf6c501aa5b5968a53f3aea844adf185542e2b09875619dbef874671576295219845ce2600104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourceconnector \
python3.11dist-azure-mgmt-resourceconnector \
python311-azure-mgmt-resourceconnector \
python3dist-azure-mgmt-resourceconnector"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
