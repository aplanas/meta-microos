SUMMARY = "Microsoft Azure Oep Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Oep Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-mgmt-oep-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "41a3a7256b5177b2c4d8e108ed62b0fdbb23f13631e3d8299a00cb467fbdbcb92ab60b25c88248bfbe98494a9211272d68a364731a5c2e752950edf66700e1fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-oep) \
python39-azure-mgmt-oep \
python3dist(azure-mgmt-oep)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
