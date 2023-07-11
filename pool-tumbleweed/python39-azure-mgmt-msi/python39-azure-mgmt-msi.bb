SUMMARY = "Microsoft Azure MSI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MSI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python39-azure-mgmt-msi-7.0.0-1.4.noarch.rpm"
RPM_HASH = "1d26324ff03f8947cca6fd32d2940056ba06583099d1699d8b54e39a433295c9d7eb213528e4e3da7a9fe5e9ba37d07696f6c668cb54067ca1eaf44632c6caa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-msi \
python39-azure-mgmt-msi \
python3dist-azure-mgmt-msi"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
