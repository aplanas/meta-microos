SUMMARY = "Microsoft Azure Cognitive Services Vision namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Vision namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.vision namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-azure-cognitiveservices-vision-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "f4bc57255749f92fdca3ec0ab48966f0d97ff3477e9b59760bb8a3f5bd4f549c359f2bedcd6ad7cfa9eb3a94f265334cb6bdbec7ad34eadd6f60b9ed5c032c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-nspkg \
python3.10dist-azure-cognitiveservices-vision-nspkg \
python310-azure-cognitiveservices-vision-nspkg \
python3dist-azure-cognitiveservices-vision-nspkg"

RDEPENDS:${PN} += "python310-azure-cognitiveservices-nspkg \
python310-azure-nspkg"

inherit rpm
