SUMMARY = "Microsoft Azure Defendereasm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Defendereasm Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-defendereasm-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "d73ed9334e1029c76af1f1e93e1357b0098aebf8609b25345a2ba796cae44608ac4ad590f6451107304730fab7bb89de8427139f9d781198f7e3db1fe85af677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-defendereasm \
python3.10dist-azure-mgmt-defendereasm \
python310-azure-mgmt-defendereasm \
python3dist-azure-mgmt-defendereasm"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
