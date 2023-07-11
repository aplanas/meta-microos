SUMMARY = "Microsoft Azure Logic Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Logic Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python39-azure-mgmt-logic-10.0.0-1.4.noarch.rpm"
RPM_HASH = "672311b7a460ffda990b73a4007baf7af1e40ac329f1489df51885924a0afc72262e9cbae662040eb51e6ff0fd0ee003da6fc9ba8ec1d98e2b13b0690d032514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-logic \
python39-azure-mgmt-logic \
python3dist-azure-mgmt-logic"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
