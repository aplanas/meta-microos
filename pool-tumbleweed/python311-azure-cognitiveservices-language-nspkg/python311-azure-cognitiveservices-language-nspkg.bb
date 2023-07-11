SUMMARY = "Microsoft Azure Cognitive Services Language namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Language namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.language namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-azure-cognitiveservices-language-nspkg-3.0.1-3.10.noarch.rpm"
RPM_HASH = "d224ec6f546e8340645fc2c1f0c68000e10e42fcc12df9d90aa6b2132d3be37da13cd05a62091c2a34ba2e0484a2c072dce2bebf90f383329dc8993e4872ab1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-language-nspkg \
python3.11dist-azure-cognitiveservices-language-nspkg \
python311-azure-cognitiveservices-language-nspkg \
python3dist-azure-cognitiveservices-language-nspkg"

RDEPENDS:${PN} += "python311-azure-cognitiveservices-nspkg \
python311-azure-nspkg"

inherit rpm
