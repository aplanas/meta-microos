SUMMARY = "Microsoft Azure Connectedvmware Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Connectedvmware Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python310-azure-mgmt-connectedvmware-1.0.0b3-1.3.noarch.rpm"
RPM_HASH = "2486749a6001885c95010fd5573a9646351f156a0222a9eb7502f31a0c4bcb41e14875fca7707f75ffbfd5442342dafb75579c374dda6755e05b583d22a3347e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-connectedvmware \
python3.10dist(azure-mgmt-connectedvmware) \
python310-azure-mgmt-connectedvmware \
python3dist(azure-mgmt-connectedvmware)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
