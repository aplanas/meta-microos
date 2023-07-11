SUMMARY = "Microsoft Azure Cognitive Services Content Moderator Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Content Moderator Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-cognitiveservices-vision-contentmoderator-1.0.0-3.12.noarch.rpm"
RPM_HASH = "ba7cccc0a21b38277384020b8e7a29e8d8be60e57f225ece6db2129caa36c1e62dd7e2affe8a350c4c21b7b4072783257bffe7a8474958625551b23c9f6e8317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-vision-contentmoderator \
python310-azure-cognitiveservices-vision-contentmoderator \
python3dist-azure-cognitiveservices-vision-contentmoderator"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-vision-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
