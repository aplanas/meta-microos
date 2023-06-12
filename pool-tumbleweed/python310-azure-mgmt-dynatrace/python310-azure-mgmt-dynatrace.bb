SUMMARY = "Microsoft Azure Dynatrace Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dynatrace Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-dynatrace-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "02364f8c2bce48573a699e3da582484e91abfd63726c1b2fb3f7b33d7d1559e9df6a35a7392662edb066f82c9cc65bef547919efe502fad71ede9b372d906140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dynatrace \
python3.10dist(azure-mgmt-dynatrace) \
python310-azure-mgmt-dynatrace \
python3dist(azure-mgmt-dynatrace)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
