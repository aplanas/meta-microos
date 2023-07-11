SUMMARY = "Microsoft Azure QnA Maker Client Library"
DESCRIPTION = "This is the Microsoft Azure QnA Maker Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-azure-cognitiveservices-knowledge-qnamaker-0.3.0-2.12.noarch.rpm"
RPM_HASH = "ac131a37d8a557826e836c275063d0ac4f9f4d0f226b3bf7ca5551b245efb985f8131015e17d952300c9d1ba5341bfea1d5da9f191f5674571bbb6d7d32713bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-knowledge-qnamaker \
python3.11dist-azure-cognitiveservices-knowledge-qnamaker \
python311-azure-cognitiveservices-knowledge-qnamaker \
python3dist-azure-cognitiveservices-knowledge-qnamaker"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-knowledge-nspkg \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
