SUMMARY = "Microsoft Azure Cognitive Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "13.4.0"

RPM_NAME = "python310-azure-mgmt-cognitiveservices-13.4.0-1.3.noarch.rpm"
RPM_HASH = "5e5e0deb33fdcf065d9214e60882e40bfd153ffc5853837124a8006b7798503ac427e19ca444c2ff65ad593b38b8e89ce9f3d9ad685a600128e053fdfda77a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-cognitiveservices \
python3.10dist-azure-mgmt-cognitiveservices \
python310-azure-mgmt-cognitiveservices \
python3dist-azure-mgmt-cognitiveservices"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
