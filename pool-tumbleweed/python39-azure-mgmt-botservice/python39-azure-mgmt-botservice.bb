SUMMARY = "Microsoft Azure Bot Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Bot Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0.0"

RPM_NAME = "python39-azure-mgmt-botservice-2.0.0.0-1.3.noarch.rpm"
RPM_HASH = "ed0b08a9a00949f7d1278a6b2b37c74f9cd0b7ce39958995da7b26e2ab012218f5fcf18f697d6cf2c636f064f1abafe12f996ad942f812ccc61ffa12f735c3a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-botservice \
python39-azure-mgmt-botservice \
python3dist-azure-mgmt-botservice"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 if python39-base < 3.8 \
python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
