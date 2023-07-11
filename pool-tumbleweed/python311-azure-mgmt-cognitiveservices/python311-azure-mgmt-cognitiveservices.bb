SUMMARY = "Microsoft Azure Cognitive Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "13.4.0"

RPM_NAME = "python311-azure-mgmt-cognitiveservices-13.4.0-1.4.noarch.rpm"
RPM_HASH = "31434f1f6b42878cc5bff44f6d402c19e6f3a86cd59fec727ffac1743928dbb679bd7667cc65a40629285231a036dd509c8ac8a7fcfc5b2734c80da4514c2c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-cognitiveservices \
python3.11dist-azure-mgmt-cognitiveservices \
python311-azure-mgmt-cognitiveservices \
python3dist-azure-mgmt-cognitiveservices"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
