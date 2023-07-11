SUMMARY = "Microsoft Azure Cognitive Services Content Moderator Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Content Moderator Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-cognitiveservices-vision-contentmoderator-1.0.0-3.12.noarch.rpm"
RPM_HASH = "9ac37aef9498bafda3d645abcac2fb7bb06ed3d8c3515b7f28b23ed146ffaf776454d6ce428f96653aeb55d40e35b04b0c80dd539fb45ff6d0ca82b8dae4846f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-contentmoderator \
python3.11dist-azure-cognitiveservices-vision-contentmoderator \
python311-azure-cognitiveservices-vision-contentmoderator \
python3dist-azure-cognitiveservices-vision-contentmoderator"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-vision-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
