SUMMARY = "Microsoft Azure Dev Spaces Client Library"
DESCRIPTION = "This is the Microsoft Azure Dev Spaces Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-devspaces-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "9798f9507cf6af859690645d1799eb0b87f6650314d2503563fee8b098ba9dbce3b11de043eda1dd685ab7711396cec5f82242f9972cfea9426ab21d9812dac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-devspaces \
python310-azure-mgmt-devspaces \
python3dist-azure-mgmt-devspaces"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
