SUMMARY = "Microsoft Azure PowerBIDedicated Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure PowerBIDedicated Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-powerbidedicated-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "dd86c7c22ced389bad5c1c5e590b65491f27c3e48d3420daa6de262410e9f14dadf7925fd827d6452407d56f1433ffc709d3fc4ee8ff1acba00d6e0061dd4dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-powerbidedicated \
python39-azure-mgmt-powerbidedicated \
python3dist-azure-mgmt-powerbidedicated"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
