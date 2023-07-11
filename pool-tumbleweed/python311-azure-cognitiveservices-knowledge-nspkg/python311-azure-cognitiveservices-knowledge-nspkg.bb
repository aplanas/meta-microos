SUMMARY = "Microsoft Azure Cognitive Services Knowledge namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Knowledge namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.knowledge namespace."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-azure-cognitiveservices-knowledge-nspkg-3.0.0-4.10.noarch.rpm"
RPM_HASH = "b6995820847eb8c749fe444459d6e88c6d9e17ead9a315b463b21eea72e7347dde58036ad42c518fe4bbac569590f2bec7822accd7aba2a8228260568fb89d07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-knowledge-nspkg \
python3.11dist-azure-cognitiveservices-knowledge-nspkg \
python311-azure-cognitiveservices-knowledge-nspkg \
python3dist-azure-cognitiveservices-knowledge-nspkg"

RDEPENDS:${PN} += "python311-azure-cognitiveservices-nspkg \
python311-azure-nspkg"

inherit rpm
