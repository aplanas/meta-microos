SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-azure-mgmt-vmwarecloudsimple-0.2.0-2.11.noarch.rpm"
RPM_HASH = "255da2a458222a0befc2b349bd691c95ea29e79a88215d86efb944df5ca3cb6ccbd7d9eca2a65e8a5ef9c5cc8d69a9ad9b5695d665249a06d67575a258458bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-vmwarecloudsimple \
python3.10dist-azure-mgmt-vmwarecloudsimple \
python310-azure-mgmt-vmwarecloudsimple \
python3dist-azure-mgmt-vmwarecloudsimple"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest \
python310-msrestazure"

inherit rpm
