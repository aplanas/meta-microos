SUMMARY = "Microsoft Azure Mobilenetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mobilenetwork Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-azure-mgmt-mobilenetwork-3.0.0-1.1.noarch.rpm"
RPM_HASH = "8c664ee3d09c299656f0ab7269720bb5bc24c46ae4631156c928a4e3426de069d003538a56c904ba58db19f5312500948b3c70f694d8aa6f8441d7f20635539d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-mobilenetwork \
python3.11dist-azure-mgmt-mobilenetwork \
python311-azure-mgmt-mobilenetwork \
python3dist-azure-mgmt-mobilenetwork"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
