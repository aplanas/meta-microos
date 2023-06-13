SUMMARY = "Microsoft Azure Cognitive Services LUIS Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services LUIS Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-azure-cognitiveservices-language-luis-0.7.0-2.11.noarch.rpm"
RPM_HASH = "e2e0081559c1d3aa0e41a87432dd9cb282d9b3c36c06bb3f863d4908acb20bcb4df1608e7e80b7da8ffc2cc9479b1b62371df77b6e1969a50ce7d7d8cb268544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-language-luis) \
python311-azure-cognitiveservices-language-luis \
python3dist(azure-cognitiveservices-language-luis)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-language-nspkg \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest \
python311-msrestazure"

inherit rpm
