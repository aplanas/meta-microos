SUMMARY = "Microsoft Azure Hybrid Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Hybrid Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python310-azure-mgmt-hybridcompute-8.0.0-1.2.noarch.rpm"
RPM_HASH = "fad22a8d74dcd7130ed76ef43cfcb85f0645ac88a87276e765bb4de94f3a3ce26a87e0ea6b2dfb9f9be72275eb006dfa491e031c4ca855ae46ad056f61bc75c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hybridcompute \
python3.10dist(azure-mgmt-hybridcompute) \
python310-azure-mgmt-hybridcompute \
python3dist(azure-mgmt-hybridcompute)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
