SUMMARY = "Microsoft Azure Cognitive Services namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python38-azure-cognitiveservices-nspkg-3.0.1-4.3.noarch.rpm"
RPM_HASH = "a75fda4067502d8f88bc210d28d4f844ddd73c80e1122c07af0633f16dafcbaef9d466f8866b1564b987d1d48b535d626326875b6bdbe52be8326fa3bece6678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-azure-cognitiveservices-nspkg \
python38-azure-cognitiveservices-nspkg \
python3dist-azure-cognitiveservices-nspkg"

RDEPENDS:${PN} += "python38-azure-nspkg"

inherit rpm
