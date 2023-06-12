SUMMARY = "Microsoft Azure Communication SMS Client Library for Python"
DESCRIPTION = "Azure Communication SMS client package is intended to be used to send SMS using an Azure Resource."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-azure-communication-sms-1.0.1-1.8.noarch.rpm"
RPM_HASH = "1c2ecd6e8750e05716b1ebc8f51bd9e6c9c67e1d56f6830b8e84f01c291edf5b867716328a6b960430580982edddc0313df1d954a66242219182ea89ef2aecfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-communication-sms) \
python311-azure-communication-sms \
python3dist(azure-communication-sms)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest \
python311-six"

inherit rpm
