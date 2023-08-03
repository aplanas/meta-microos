SUMMARY = "Microsoft Azure Cognitive Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "13.5.0"

RPM_NAME = "python311-azure-mgmt-cognitiveservices-13.5.0-1.1.noarch.rpm"
RPM_HASH = "b7553072fadf8dbc42e32ffa06bfd447daf6484b9e9951ac61adcc850dbfcf2d9e669d10bd0c3dfc40993deabeaf1195598a3ec7139986176faedbe734142c81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-cognitiveservices \
python3.11dist-azure-mgmt-cognitiveservices \
python311-azure-mgmt-cognitiveservices \
python3dist-azure-mgmt-cognitiveservices"

RDEPENDS:${PN} += "-python311-azure-common >= 1.1 with python311-azure-common < 2.0.0 \
-python311-azure-mgmt-core >= 1.3.2 with python311-azure-mgmt-core < 2.0.0 \
python-abi \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
