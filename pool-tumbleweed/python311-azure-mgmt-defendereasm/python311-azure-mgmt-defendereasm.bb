SUMMARY = "Microsoft Azure Defendereasm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Defendereasm Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-defendereasm-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "139fbe24d68bd1a80204a1134b92f32bfea3e7c12921e9c42d614260e7eedc744cc85d1fc6aa4f215e65d5de9ffaaf3b358a7b98abbe03149bd501f1efc0ebce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-defendereasm \
python3.11dist-azure-mgmt-defendereasm \
python311-azure-mgmt-defendereasm \
python3dist-azure-mgmt-defendereasm"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
