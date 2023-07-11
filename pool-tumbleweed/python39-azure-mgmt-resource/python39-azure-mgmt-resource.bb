SUMMARY = "Microsoft Azure Resource Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "23.1.0~b2"

RPM_NAME = "python39-azure-mgmt-resource-23.1.0~b2-1.1.noarch.rpm"
RPM_HASH = "538bc69b19eaad80dffd0f8819a484a6a75d7d9f90a61deb13c9b216eadb6f0bc98d5a9ab24770612e90b7f66fa6f0932cb0a26da98bf9af72a4b5d3ff7b85ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-resource \
python39-azure-mgmt-resource \
python3dist-azure-mgmt-resource"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
