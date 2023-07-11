SUMMARY = "Microsoft Azure QnA Maker Client Library"
DESCRIPTION = "This is the Microsoft Azure QnA Maker Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-azure-cognitiveservices-knowledge-qnamaker-0.3.0-2.12.noarch.rpm"
RPM_HASH = "5c26dc53824ca344276c1bd034e447e4ac851ae08a66e0896a5701ebbb8b85b32efab3e17487e079ebbf0af8e2a1c078bf40471874941cf03ad39386b08cec30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-knowledge-qnamaker \
python310-azure-cognitiveservices-knowledge-qnamaker \
python3dist-azure-cognitiveservices-knowledge-qnamaker"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-knowledge-nspkg \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
