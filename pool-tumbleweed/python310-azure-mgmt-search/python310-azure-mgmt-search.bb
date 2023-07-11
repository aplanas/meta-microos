SUMMARY = "Microsoft Azure Search Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Search Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python310-azure-mgmt-search-9.0.0-1.4.noarch.rpm"
RPM_HASH = "50300df673972b661fd70bd0f9a5f82ce571c150ca14a5f48db0479a24e7de80b6bc35096362b9734e331ef0db8a830d07f20012a241899b96a7ab8f6430b25a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-search \
python310-azure-mgmt-search \
python3dist-azure-mgmt-search"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
