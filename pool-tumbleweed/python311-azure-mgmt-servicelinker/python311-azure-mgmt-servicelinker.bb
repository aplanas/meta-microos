SUMMARY = "Microsoft Azure Servicelinker Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicelinker Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.2.0~b1"

RPM_NAME = "python311-azure-mgmt-servicelinker-1.2.0~b1-1.3.noarch.rpm"
RPM_HASH = "ecf5959152ce3f8d2d50499658edd7fb61ccd008631ce05c32e2a658b8b674de724b6062dfa5084521a035fec983dea723df9a1080d8fee8a8818cf4d9f254f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-servicelinker) \
python311-azure-mgmt-servicelinker \
python3dist(azure-mgmt-servicelinker)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
