SUMMARY = "Microsoft Azure Cognitive Services Knowledge namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Knowledge namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.knowledge namespace."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-azure-cognitiveservices-knowledge-nspkg-3.0.0-4.9.noarch.rpm"
RPM_HASH = "a1cf2d7fddeeacea573b0c7c6b4ebcdd9f8d1847f592e9056eaca7c7a83d9d37a480782f56a14500b1435c68ba7c969aac62945f5db758976fea53e4013dce19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-knowledge-nspkg) \
python311-azure-cognitiveservices-knowledge-nspkg \
python3dist(azure-cognitiveservices-knowledge-nspkg)"

RDEPENDS:${PN} += "python311-azure-cognitiveservices-nspkg \
python311-azure-nspkg"

inherit rpm
