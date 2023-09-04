SUMMARY = "Microsoft Azure Apicenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Apicenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-apicenter-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "eb675efe46fca0179b619a4494cd4e9d73d598a97e070ab667a9e6f9261ce794eac636544f9ca024182c0166870b16dadaf7f268e074256d0a1e95d0142ae685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-apicenter \
python3.11dist-azure-mgmt-apicenter \
python311-azure-mgmt-apicenter \
python3dist-azure-mgmt-apicenter"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
