SUMMARY = "Microsoft Azure Webpubsub Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Webpubsub Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-webpubsub-1.1.0-1.3.noarch.rpm"
RPM_HASH = "468c4a14e05439303c2f0051ba5b45fd90b3da4217e14ccc0ebb27c98e77357320f08175d79a77776cca9553d182c692c62184a9baf19cc48f9933aad0b4a5b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-webpubsub \
python3.11dist-azure-mgmt-webpubsub \
python311-azure-mgmt-webpubsub \
python3dist-azure-mgmt-webpubsub"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
