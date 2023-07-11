SUMMARY = "Microsoft Azure Cognitive Services LUIS Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services LUIS Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-azure-cognitiveservices-language-luis-0.7.0-2.12.noarch.rpm"
RPM_HASH = "7d71b8231fc27370bb30328e83e9c872b0da82e971a8d544599d3fd54fe6795beba6a72e3b85e12b71257fcc070a9c67ac1cf71b0dc1b19324af8add80c56fa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-language-luis \
python39-azure-cognitiveservices-language-luis \
python3dist-azure-cognitiveservices-language-luis"

RDEPENDS:${PN} += "python-abi \
python39-azure-cognitiveservices-language-nspkg \
python39-azure-cognitiveservices-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest \
python39-msrestazure"

inherit rpm
