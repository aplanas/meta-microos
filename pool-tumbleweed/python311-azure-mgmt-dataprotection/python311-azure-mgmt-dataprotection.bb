SUMMARY = "Microsoft Azure Dataprotection Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dataprotection Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-dataprotection-1.1.0-1.1.noarch.rpm"
RPM_HASH = "e62c6675179b6cb458a8dad12d37fc9e982e545c6454789d6b4488948a3a53606ab1ae5df276fa48b985c34d16232c1f339b5577c517f8ef722706290d71e4d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dataprotection \
python3.11dist-azure-mgmt-dataprotection \
python311-azure-mgmt-dataprotection \
python3dist-azure-mgmt-dataprotection"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
