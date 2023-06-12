SUMMARY = "Microsoft Azure QnA Maker Client Library"
DESCRIPTION = "This is the Microsoft Azure QnA Maker Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-azure-cognitiveservices-knowledge-qnamaker-0.3.0-2.11.noarch.rpm"
RPM_HASH = "4e39febee229792496d47dcd60388cd99d58712a6f584fbdaea7b3334ebfeaa8cef6666eae6264def6724c2c6ad52d00da68eb16df955180c8303ab79a75f26c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-knowledge-qnamaker) \
python311-azure-cognitiveservices-knowledge-qnamaker \
python3dist(azure-cognitiveservices-knowledge-qnamaker)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-knowledge-nspkg \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
