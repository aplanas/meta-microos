SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "23.0.0"

RPM_NAME = "python310-azure-mgmt-containerservice-23.0.0-1.1.noarch.rpm"
RPM_HASH = "9ff6978531d7c7b68076299de82320122885acd0ec9d48e0e22e426d4cbbe04023f26cc1ff7aebe4a8fb7881cb7003ab81d43743d23c8e1b8f45a9359639408f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerservice \
python3.10dist-azure-mgmt-containerservice \
python310-azure-mgmt-containerservice \
python3dist-azure-mgmt-containerservice"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
