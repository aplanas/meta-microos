SUMMARY = "Microsoft Azure Hybrid Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Hybrid Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python39-azure-mgmt-hybridcompute-8.0.0-1.3.noarch.rpm"
RPM_HASH = "4cf4a8784ae19eb02cf5931eadc32abec9eb94681d1545a3667428bd89eba60012e68d52f1a444d2bc4693f7f1e0f2c27f82c36b927e3e5e49d9c520df46fcd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-hybridcompute \
python39-azure-mgmt-hybridcompute \
python3dist-azure-mgmt-hybridcompute"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
