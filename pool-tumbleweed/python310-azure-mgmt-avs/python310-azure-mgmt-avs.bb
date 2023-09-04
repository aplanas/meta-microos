SUMMARY = "Microsoft Azure VMware Solution Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure VMware Solution Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python310-azure-mgmt-avs-8.0.0-1.1.noarch.rpm"
RPM_HASH = "fa1b66371edd4df5222bfd86b9d48b5f37cb24334999fdd909f86033c43a7f18ccc6d6ef667c15608f4851200b91228ff581610f61c6495e4175148a3c4cb0bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-avs \
python310-azure-mgmt-avs \
python3dist-azure-mgmt-avs"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
