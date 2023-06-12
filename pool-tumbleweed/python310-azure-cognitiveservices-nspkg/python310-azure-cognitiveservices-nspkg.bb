SUMMARY = "Microsoft Azure Cognitive Services namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-azure-cognitiveservices-nspkg-3.0.1-4.3.noarch.rpm"
RPM_HASH = "dbd0db429f8d3fca8a3ef53e2ce7d7dd5118640b6c20c33b2769070fa680a899c006e9a9faf0ffc63d08b1d148a751b5e1acd41e1c858b1a80d1c4af5732752e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-nspkg \
python3.10dist(azure-cognitiveservices-nspkg) \
python310-azure-cognitiveservices-nspkg \
python3dist(azure-cognitiveservices-nspkg)"
RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm
