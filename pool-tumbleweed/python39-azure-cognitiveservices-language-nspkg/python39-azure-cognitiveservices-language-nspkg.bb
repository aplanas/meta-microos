SUMMARY = "Microsoft Azure Cognitive Services Language namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Language namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.language namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-azure-cognitiveservices-language-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "bc2dd9e9b63501381e93ee4e5e6a4637e615af78ade84a2271b428079089bc2671dbb1c83d43e12752031cc12e156f1751160f5285ce24c4059df723fb2cfa56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-language-nspkg) \
python39-azure-cognitiveservices-language-nspkg \
python3dist(azure-cognitiveservices-language-nspkg)"
RDEPENDS:${PN} += "python39-azure-cognitiveservices-nspkg \
python39-azure-nspkg"

inherit rpm
