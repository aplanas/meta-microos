SUMMARY = "Microsoft Azure ManagementPartner Management Client Library"
DESCRIPTION = "This is the Microsoft Azure ManagementPartner Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-managementpartner-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "cfd0d2ac2f4c77eebcafe2a43a9546eca0accd922e81ad7682f1400fdd7b715f24a9f5d1a9e09f897b6889bd6819fbd804371f563158a5a2402a2f83cf936265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-managementpartner) \
python311-azure-mgmt-managementpartner \
python3dist(azure-mgmt-managementpartner)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
