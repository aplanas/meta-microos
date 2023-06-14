SUMMARY = "Microsoft Azure CustomProviders Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure CustomProviders Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-customproviders-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "6c3a5f46b76cb49862b5123b68ce4b3f8c5fee45267d14fd1b25feee9adcddc7da744b58810c336dfa4e78a38a941b649d11f60ddc3f369d626e76aa7585688d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-customproviders \
python311-azure-mgmt-customproviders \
python3dist-azure-mgmt-customproviders"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
