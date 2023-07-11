SUMMARY = "Microsoft Azure Cognitive Services Vision namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Vision namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.vision namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-azure-cognitiveservices-vision-nspkg-3.0.1-3.10.noarch.rpm"
RPM_HASH = "4a444b0aea7675ebf2cc616fe0ea81a3b26b679745c1d328e581bfdd3717ed820eb570a754846c24289595007a150488e0996b4cc598d22e71bc287e79873e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-nspkg \
python3.11dist-azure-cognitiveservices-vision-nspkg \
python311-azure-cognitiveservices-vision-nspkg \
python3dist-azure-cognitiveservices-vision-nspkg"

RDEPENDS:${PN} += "python311-azure-cognitiveservices-nspkg \
python311-azure-nspkg"

inherit rpm
