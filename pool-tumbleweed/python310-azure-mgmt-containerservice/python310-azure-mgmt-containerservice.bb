SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "26.0.0"

RPM_NAME = "python310-azure-mgmt-containerservice-26.0.0-1.1.noarch.rpm"
RPM_HASH = "1cc3d56d40af796d63bedd8ab44c08ddd94ac7d20fbfbd5fb87055234a91a42a0dd082fbc11e99820a24a9f8d83ea586296d272c581e14223e37f9e2586dedf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-containerservice \
python310-azure-mgmt-containerservice \
python3dist-azure-mgmt-containerservice"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
