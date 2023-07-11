SUMMARY = "Microsoft Azure Cognitive Services LUIS Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services LUIS Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-azure-cognitiveservices-language-luis-0.7.0-2.12.noarch.rpm"
RPM_HASH = "f2d5f2ec754516197b99516f1602722fe31c097f969c36fd6b642cab93d7938bd30ca0658b77ddbb742041e9e43c3a632e9fb64819bc965d3d1fdf3d51b46a01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-language-luis \
python3.11dist-azure-cognitiveservices-language-luis \
python311-azure-cognitiveservices-language-luis \
python3dist-azure-cognitiveservices-language-luis"

RDEPENDS:${PN} += "python-abi \
python311-azure-cognitiveservices-language-nspkg \
python311-azure-cognitiveservices-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest \
python311-msrestazure"

inherit rpm
