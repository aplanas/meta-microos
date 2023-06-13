SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-baremetalinfrastructure-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "a4c705aefe580ece226f93c551f3ee872b340de84b1b6880cac21afd6b3be00c5a98603fb60df05726ea3458e2ba66f0bf5cd2e0c442160de524618275ec9d9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-baremetalinfrastructure) \
python39-azure-mgmt-baremetalinfrastructure \
python3dist(azure-mgmt-baremetalinfrastructure)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
