SUMMARY = "Microsoft Azure Cognitive Services Text Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Text Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-azure-cognitiveservices-language-textanalytics-0.2.1-1.7.noarch.rpm"
RPM_HASH = "bf30ca15fcb239838b446065f308b3a966f96aa51acc3f071f1fa059703f718cb6791c868242a4fae4b52e986c3a1b64adf845345b6b39d741a0f4c526a4b7f5"
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
