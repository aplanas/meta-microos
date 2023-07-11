SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "24.0.0"

RPM_NAME = "python39-azure-mgmt-containerservice-24.0.0-1.1.noarch.rpm"
RPM_HASH = "58efbaa574160b78d7dddf2d43757a025d02b4f9481181f94a78cf6b89ab648a7afd62dd69a7be0917f6036b39fa31c703220faea9400d982bb58cccb993483e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-containerservice \
python39-azure-mgmt-containerservice \
python3dist-azure-mgmt-containerservice"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
