SUMMARY = "Microsoft Azure Hybrid Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Hybrid Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python311-azure-mgmt-hybridcompute-8.0.0-1.3.noarch.rpm"
RPM_HASH = "4a9309f805e2dfa687e2d1c7bd0ab03f79e7b69a943be802994bfb6e43f2c675891207861920b02d10c0f2e0f8bacaa881f7faec9bdbcf2ed249809890ab76cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hybridcompute \
python3.11dist-azure-mgmt-hybridcompute \
python311-azure-mgmt-hybridcompute \
python3dist-azure-mgmt-hybridcompute"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
