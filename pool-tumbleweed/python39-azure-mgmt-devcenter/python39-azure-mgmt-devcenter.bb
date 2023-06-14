SUMMARY = "Microsoft Azure Devcenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devcenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-devcenter-1.0.0.0-1.1.noarch.rpm"
RPM_HASH = "2ca30915b9a5121ddfb7d960aff8b11e3b7ea259ab9863a37626a9990bc3713c6618574e20f6376f0f9abb0807de9d65df7933ad20398208c9cabd1c575f5fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-devcenter \
python39-azure-mgmt-devcenter \
python3dist-azure-mgmt-devcenter"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 if python39-base < 3.8 \
python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
