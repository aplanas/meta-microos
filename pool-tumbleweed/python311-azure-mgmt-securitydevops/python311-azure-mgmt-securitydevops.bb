SUMMARY = "Microsoft Azure Securitydevops Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Securitydevops Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python311-azure-mgmt-securitydevops-1.0.0~b2-1.4.noarch.rpm"
RPM_HASH = "c1384d6ab00b985089b50f52f0c6f3a02bb3914a26739838a247db82b2bf1b00dc3805cf37eb3d3bd609c6ccbaf3599996dde1d107d9f3b67da85752a016191a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-securitydevops \
python3.11dist-azure-mgmt-securitydevops \
python311-azure-mgmt-securitydevops \
python3dist-azure-mgmt-securitydevops"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
