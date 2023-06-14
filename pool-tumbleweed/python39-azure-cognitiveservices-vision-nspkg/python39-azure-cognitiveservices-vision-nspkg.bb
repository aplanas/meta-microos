SUMMARY = "Microsoft Azure Cognitive Services Vision namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Vision namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.vision namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-azure-cognitiveservices-vision-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "d945b6953c3b22fd462073417ac95a99d0d5eca3e06247a0f19bd17b2573a3072b66850d3b5b0aab99a548a108e3e708095d9d08a1fd2796744692ccc9bdc815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cognitiveservices-vision-nspkg \
python39-azure-cognitiveservices-vision-nspkg \
python3dist-azure-cognitiveservices-vision-nspkg"

RDEPENDS:${PN} += "python39-azure-cognitiveservices-nspkg \
python39-azure-nspkg"

inherit rpm
