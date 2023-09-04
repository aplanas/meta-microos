SUMMARY = "Microsoft Azure Mobilenetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mobilenetwork Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-azure-mgmt-mobilenetwork-3.0.0-1.1.noarch.rpm"
RPM_HASH = "340361e03338979db59a6124a59a057e4edb84cbc152e6023f30f741e3f3dc3ba1a768e9764f19a955a9577506e349d6fe56e21d77c231ed40912cf0c920a774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-mobilenetwork \
python310-azure-mgmt-mobilenetwork \
python3dist-azure-mgmt-mobilenetwork"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
