SUMMARY = "Microsoft Azure Logic Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Logic Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python310-azure-mgmt-logic-10.0.0-1.4.noarch.rpm"
RPM_HASH = "b2b0c9aff02edd08af4604bf1d1483919231952f9f2ab92896552745e8b02e1b08f855afb15fb3c2511051a6bb4e7fa64a36d5b4e19bc78b193ad0b35afa3bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-logic \
python310-azure-mgmt-logic \
python3dist-azure-mgmt-logic"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
