SUMMARY = "Microsoft Azure Cognitive Services Language namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Language namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.language namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-azure-cognitiveservices-language-nspkg-3.0.1-3.10.noarch.rpm"
RPM_HASH = "e703e5da0546575250fb18913d81ff02146af699c674eef5b4e6698f73f661ec4f9400523f68be40627ecbd7a45a96f7e1656043a7be8b74a7f6f2de804c1cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-language-nspkg \
python310-azure-cognitiveservices-language-nspkg \
python3dist-azure-cognitiveservices-language-nspkg"

RDEPENDS:${PN} += "python310-azure-cognitiveservices-nspkg \
python310-azure-nspkg"

inherit rpm
