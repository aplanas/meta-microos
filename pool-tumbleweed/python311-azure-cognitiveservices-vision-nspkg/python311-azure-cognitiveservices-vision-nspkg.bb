SUMMARY = "Microsoft Azure Cognitive Services Vision namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Vision namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.vision namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-azure-cognitiveservices-vision-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "06be0d6280e142f114f31b7369997185bf59ac789a7636bb15d51ee97cd761409112dd5c31b0904d271aaf12f295cd1455ba7314879e971e0c0f9c2ce36bf589"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-cognitiveservices-vision-nspkg \
python311-azure-cognitiveservices-vision-nspkg \
python3dist-azure-cognitiveservices-vision-nspkg"

RDEPENDS:${PN} += "python311-azure-cognitiveservices-nspkg \
python311-azure-nspkg"

inherit rpm
