SUMMARY = "Microsoft Azure Cognitive Services Text Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Text Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-azure-cognitiveservices-language-textanalytics-0.2.1-1.7.noarch.rpm"
RPM_HASH = "4f068ea55ee0f7a1702831bd19311e9aaca0047ff808a450257736cc781a09bf3f3790451bfe81d13b3331a51af42b1b27e75eeb222393c919059ce7d3b46df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-language-textanalytics \
python3.11dist-azure-cognitiveservices-language-textanalytics \
python311-azure-cognitiveservices-language-textanalytics \
python3dist-azure-cognitiveservices-language-textanalytics"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-language-nspkg \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-nspkg \
python311-msrest"

inherit rpm
