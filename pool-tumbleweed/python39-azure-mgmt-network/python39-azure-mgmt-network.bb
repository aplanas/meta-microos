SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "25.0.0"

RPM_NAME = "python39-azure-mgmt-network-25.0.0-1.1.noarch.rpm"
RPM_HASH = "acf6fe82ccd7e78215cd286f1c2c4a4d349acf71091408574ee392af08e3521349c687b5b95c61d5639de46fc5319a5af729506644bd9bc98f29455da309d8d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-network \
python39-azure-mgmt-network \
python3dist-azure-mgmt-network"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
