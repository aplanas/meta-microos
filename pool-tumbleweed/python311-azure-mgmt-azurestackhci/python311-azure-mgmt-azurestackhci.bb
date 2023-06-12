SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python311-azure-mgmt-azurestackhci-7.0.0-1.5.noarch.rpm"
RPM_HASH = "01f87111e04adc1530523c157d922cf924182b9d3ffe9015a209687560ad3bae87a25eb2211750d297f360d362bea9272952f72fb58bc57ce285b601fe88c121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-azurestackhci) \
python311-azure-mgmt-azurestackhci \
python3dist(azure-mgmt-azurestackhci)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
