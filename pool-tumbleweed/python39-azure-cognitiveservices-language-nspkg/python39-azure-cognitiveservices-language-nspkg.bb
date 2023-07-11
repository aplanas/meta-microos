SUMMARY = "Microsoft Azure Cognitive Services Language namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Language namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.language namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-azure-cognitiveservices-language-nspkg-3.0.1-3.10.noarch.rpm"
RPM_HASH = "bb47ed1935b582832a051c1c1d134149eec4b888b62cdae4a0f94a0e08aff9f6e76637a31458cc6e3588581055a811aeb6f481c4562f00f6d804497f195b823d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-language-nspkg \
python39-azure-cognitiveservices-language-nspkg \
python3dist-azure-cognitiveservices-language-nspkg"

RDEPENDS:${PN} += "python39-azure-cognitiveservices-nspkg \
python39-azure-nspkg"

inherit rpm
