SUMMARY = "Microsoft Azure Cognitive Services Knowledge namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Knowledge namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.knowledge namespace."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python38-azure-cognitiveservices-knowledge-nspkg-3.0.0-4.9.noarch.rpm"
RPM_HASH = "18523c30b6ffd3028f17dc62d0629287ec67782fc617280caf6d312bfdeeba837ac146918899d364dc69ab2888c00827a99b189de9d3c2a17a3218121ef672fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(azure-cognitiveservices-knowledge-nspkg) \
python38-azure-cognitiveservices-knowledge-nspkg \
python3dist(azure-cognitiveservices-knowledge-nspkg)"
RDEPENDS:${PN} += "python38-azure-cognitiveservices-nspkg \
python38-azure-nspkg"

inherit rpm
