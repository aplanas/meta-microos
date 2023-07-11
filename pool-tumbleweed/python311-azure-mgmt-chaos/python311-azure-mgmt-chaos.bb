SUMMARY = "Microsoft Azure Chaos Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Chaos Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b6"

RPM_NAME = "python311-azure-mgmt-chaos-1.0.0b6-1.4.noarch.rpm"
RPM_HASH = "8b1d6493c8bedaef11f316ff27d42b88a3a57d9869846534990c99e3c2f45a4b04ef4ac7cbabf35bbea3a2ee6a607047edc392110f93b9295864abd5eeb0f7f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-chaos \
python3.11dist-azure-mgmt-chaos \
python311-azure-mgmt-chaos \
python3dist-azure-mgmt-chaos"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
