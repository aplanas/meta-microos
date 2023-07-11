SUMMARY = "Microsoft Azure QnA Maker Client Library"
DESCRIPTION = "This is the Microsoft Azure QnA Maker Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-azure-cognitiveservices-knowledge-qnamaker-0.3.0-2.12.noarch.rpm"
RPM_HASH = "82436a308830f562976e3b1ccde8ae50682132d75b1e77079ebdb299b62904c672a517bf42589cbab18dde0c3b571e5f157ebc1df771d035b517ac6a4163b67d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-knowledge-qnamaker \
python39-azure-cognitiveservices-knowledge-qnamaker \
python3dist-azure-cognitiveservices-knowledge-qnamaker"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-knowledge-nspkg \
python39-azure-cognitiveservices-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
