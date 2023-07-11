SUMMARY = "Microsoft Azure CustomProviders Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure CustomProviders Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-customproviders-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "7ac1ae1082988dda7dd18d61adc5d4df8b89567fa3bfe5a0dbf38a49313c109d2cc30d432ea90b3775fb4d57ae798b54d7d98673b60a3785658686222438555a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-customproviders \
python3.11dist-azure-mgmt-customproviders \
python311-azure-mgmt-customproviders \
python3dist-azure-mgmt-customproviders"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
