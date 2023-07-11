SUMMARY = "Microsoft Azure Cognitive Services LUIS Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services LUIS Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-azure-cognitiveservices-language-luis-0.7.0-2.12.noarch.rpm"
RPM_HASH = "45aec86703cdca414f8fe534a62464415eb71f0b55764446e8d11d9e75e03c00208eeb2354f2b76b98015d1899b54c98198faf83660693ca8ceddd4cdc076a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-language-luis \
python310-azure-cognitiveservices-language-luis \
python3dist-azure-cognitiveservices-language-luis"

RDEPENDS:${PN} += "python-abi \
python310-azure-cognitiveservices-language-nspkg \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest \
python310-msrestazure"

inherit rpm
