SUMMARY = "Microsoft Azure QnA Maker Client Library"
DESCRIPTION = "This is the Microsoft Azure QnA Maker Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-azure-cognitiveservices-knowledge-qnamaker-0.3.0-2.11.noarch.rpm"
RPM_HASH = "892f9936155978edea5ae66cc9615413ba122c8213a5c6017add07a48846fcb100958a1ca5efb5bbebec799f754f951ec22ef67e4fc0bdf777166a2ba26c645a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-knowledge-qnamaker \
python3.10dist(azure-cognitiveservices-knowledge-qnamaker) \
python310-azure-cognitiveservices-knowledge-qnamaker \
python3dist(azure-cognitiveservices-knowledge-qnamaker)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-cognitiveservices-knowledge-nspkg \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
