SUMMARY = "Microsoft Azure SAP Hana on Azure Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SAP Hana on Azure Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-hanaonazure-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "12dcdb158278ef918754b1b9d8f546caf46be52fa6463d4bc92bef69059e2d274399716108d47bee6f6a8b01e47a4b03495d952e058bdb577df52ff5a70cadc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-hanaonazure \
python311-azure-mgmt-hanaonazure \
python3dist-azure-mgmt-hanaonazure"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
