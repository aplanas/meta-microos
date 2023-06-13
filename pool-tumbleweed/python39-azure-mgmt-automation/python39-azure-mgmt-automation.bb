SUMMARY = "Microsoft Azure Automation Client Library"
DESCRIPTION = "This is the Microsoft Azure Automation Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0b2"

RPM_NAME = "python39-azure-mgmt-automation-1.1.0b2-1.3.noarch.rpm"
RPM_HASH = "37fdf2526cdbc3e11e9bdf0c1266e2b5a12c77b136fbb7636a22f45f98d495664b5ed4bfa8ea3a0869e3624bdc1e7f8110faccb260e62c61be146f5075e43e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-automation) \
python39-azure-mgmt-automation \
python3dist(azure-mgmt-automation)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
