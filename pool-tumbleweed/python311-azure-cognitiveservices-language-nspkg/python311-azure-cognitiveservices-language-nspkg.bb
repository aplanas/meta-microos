SUMMARY = "Microsoft Azure Cognitive Services Language namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Language namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.language namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-azure-cognitiveservices-language-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "5649df93be38ab2b830c2fb72cdc08131caef94d8a3d1a65bd3c08c911fe3976c1fe0555dff7d4f2c24ba963c013d459c18ce34866ad0c6b98965a0f24d98572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-language-nspkg) \
python311-azure-cognitiveservices-language-nspkg \
python3dist(azure-cognitiveservices-language-nspkg)"
RDEPENDS:${PN} += "python311-azure-cognitiveservices-nspkg \
python311-azure-nspkg"

inherit rpm
