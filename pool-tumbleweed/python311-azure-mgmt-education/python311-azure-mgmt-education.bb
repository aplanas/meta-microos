SUMMARY = "Microsoft Azure Education Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Education Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python311-azure-mgmt-education-1.0.0~b2-1.4.noarch.rpm"
RPM_HASH = "44d8337ea9c056d153e6535b809bcc0f77b565e883310ea2a06b6efa761c635714ca048f076e5e42c4480950837d87c9116426c6d81b2a0eec19fb994bf7430e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-education \
python3.11dist-azure-mgmt-education \
python311-azure-mgmt-education \
python3dist-azure-mgmt-education"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
