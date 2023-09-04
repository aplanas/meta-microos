SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "25.0.0"

RPM_NAME = "python310-azure-mgmt-network-25.0.0-1.1.noarch.rpm"
RPM_HASH = "3eafdd4def9ba66012c0629339181543301ef85cca02c4024a0736b4b9c062c41879b8f8b04705f0aaab7deec6fc7dc2b39bd58036cf0e1e5e4027c2e559b2c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-network \
python310-azure-mgmt-network \
python3dist-azure-mgmt-network"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
