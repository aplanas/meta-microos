SUMMARY = "Microsoft Azure Defendereasm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Defendereasm Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-defendereasm-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "b66bed26b7ddcf5bcecced0f17461052be67219523560e2b5d44e8c8d2a6cc63741329055d2e84a8cd5503f5db07527a939770e20f3e6b8fcb5ca5d75802992c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-defendereasm \
python310-azure-mgmt-defendereasm \
python3dist-azure-mgmt-defendereasm"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
