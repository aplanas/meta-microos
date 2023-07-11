SUMMARY = "Microsoft Azure Elastic Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elastic Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-elastic-1.0.0-1.9.noarch.rpm"
RPM_HASH = "9e262b144269fa75d22fdcb7c986a55bb8d4dcc9be4670380027349ccbddcce68e03d2583fae67d748292acd7726632749c65b221fc194353654c4c68272bceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-elastic \
python39-azure-mgmt-elastic \
python3dist-azure-mgmt-elastic"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
