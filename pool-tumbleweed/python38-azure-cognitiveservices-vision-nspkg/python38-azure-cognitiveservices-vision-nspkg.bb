SUMMARY = "Microsoft Azure Cognitive Services Vision namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Vision namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.vision namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python38-azure-cognitiveservices-vision-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "31d1f1f29f30ab494657bd883b8ea6e3e4ca7b4afa0b9812374a5fe2ad594fd163d17b94daf1f963734c02f01047099239421e7ddda3c61deb317722b26815f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(azure-cognitiveservices-vision-nspkg) \
python38-azure-cognitiveservices-vision-nspkg \
python3dist(azure-cognitiveservices-vision-nspkg)"

RDEPENDS:${PN} += "python38-azure-cognitiveservices-nspkg \
python38-azure-nspkg"

inherit rpm
