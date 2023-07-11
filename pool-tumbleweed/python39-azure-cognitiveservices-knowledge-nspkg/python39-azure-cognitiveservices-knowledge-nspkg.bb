SUMMARY = "Microsoft Azure Cognitive Services Knowledge namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Knowledge namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.knowledge namespace."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-azure-cognitiveservices-knowledge-nspkg-3.0.0-4.10.noarch.rpm"
RPM_HASH = "c3a4e9596d8012d977ba41f2416e18c3629dc7261ddab020949cd714462f521326b418780f6884c6bf8a388bbbc9d58dab68bc2ed185a79c9c106cd12dc763a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-knowledge-nspkg \
python39-azure-cognitiveservices-knowledge-nspkg \
python3dist-azure-cognitiveservices-knowledge-nspkg"

RDEPENDS:${PN} += "python39-azure-cognitiveservices-nspkg \
python39-azure-nspkg"

inherit rpm
