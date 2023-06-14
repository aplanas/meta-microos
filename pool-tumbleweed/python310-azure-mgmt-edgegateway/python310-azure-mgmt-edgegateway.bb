SUMMARY = "Microsoft Azure Data Box Edge / Data Box Gateway Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Box Edge / Data Box Gateway Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python310-azure-mgmt-edgegateway-0.1.0-2.18.noarch.rpm"
RPM_HASH = "32e381aea6804f1269d74e06bca3136c7f8c972b1f4a35b28d8032a4c818182cb70323d9269cbdd3e2d584725c2a03673a27c26a2cd15cf28b94d644a9a6db33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-edgegateway \
python3.10dist-azure-mgmt-edgegateway \
python310-azure-mgmt-edgegateway \
python3dist-azure-mgmt-edgegateway"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest \
python310-msrestazure"

inherit rpm
