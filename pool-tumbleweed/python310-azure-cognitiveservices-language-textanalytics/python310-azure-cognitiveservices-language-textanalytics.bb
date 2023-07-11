SUMMARY = "Microsoft Azure Cognitive Services Text Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Text Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-azure-cognitiveservices-language-textanalytics-0.2.1-1.7.noarch.rpm"
RPM_HASH = "ed20cfde93d68eb6836b3a1e5ba5e9ae65c91bfd0ed8e3065af20517325047cf7435a0f97afe3fee07eef9dd5375bca25302f126d94c3d3686dbfcb734296b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-language-textanalytics \
python310-azure-cognitiveservices-language-textanalytics \
python3dist-azure-cognitiveservices-language-textanalytics"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-language-nspkg \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-nspkg \
python310-msrest"

inherit rpm
