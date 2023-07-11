SUMMARY = "Microsoft Azure Resource Mover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Mover Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0b3"

RPM_NAME = "python311-azure-mgmt-resourcemover-1.1.0b3-1.4.noarch.rpm"
RPM_HASH = "043cf281db143fcd4bbd1a6d5bb7f5a6a9d19f5ce2b2851f79b6fb448baef804db0ce1c200d0fc7bd692e9daed727bfabecaa92b84e2405a57c28590bef6e3e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourcemover \
python3.11dist-azure-mgmt-resourcemover \
python311-azure-mgmt-resourcemover \
python3dist-azure-mgmt-resourcemover"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
