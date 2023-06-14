SUMMARY = "Microsoft Azure Mixed Reality Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-mgmt-mixedreality-1.0.0b1-2.8.noarch.rpm"
RPM_HASH = "ce7bcf0a2bdf673acb41b2071c69143d9734f185efebe9519fbed76ded17a8b5ff239da5f11cbdf33de9d6dc65d3f9d52b9d5e3e7c3bb41815ff2041f2e23d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-mixedreality \
python311-azure-mgmt-mixedreality \
python3dist-azure-mgmt-mixedreality"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
