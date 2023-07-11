SUMMARY = "Microsoft Azure Container Instance Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Instance Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python310-azure-mgmt-containerinstance-10.1.0-1.2.noarch.rpm"
RPM_HASH = "5676a2784da3a69e041ea62edcb1b402bf76792f704c17cef2cd18143051567f8c49f648c0736ffe037ea4094f526cfdd68646b1b394d217cba0f7f3b9ab0cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-containerinstance \
python310-azure-mgmt-containerinstance \
python3dist-azure-mgmt-containerinstance"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
