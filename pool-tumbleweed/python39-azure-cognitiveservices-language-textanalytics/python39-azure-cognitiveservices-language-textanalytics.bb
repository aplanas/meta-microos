SUMMARY = "Microsoft Azure Cognitive Services Text Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Text Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-azure-cognitiveservices-language-textanalytics-0.2.1-1.6.noarch.rpm"
RPM_HASH = "9740fbd6145fee869143e989774f97125d86b52013ad218210590f0a70ff83915bd6fad6fcf99e67dff005a9d085f17d93a160c2ae26e2e8eb22724b9d15531b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-language-textanalytics \
python39-azure-cognitiveservices-language-textanalytics \
python3dist-azure-cognitiveservices-language-textanalytics"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-language-nspkg \
python39-azure-cognitiveservices-nspkg \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-nspkg \
python39-msrest"

inherit rpm
