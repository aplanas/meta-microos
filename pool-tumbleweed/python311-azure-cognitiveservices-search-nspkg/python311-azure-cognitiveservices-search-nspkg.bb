SUMMARY = "Microsoft Azure Cognitive Services Search namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Search namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.search namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-azure-cognitiveservices-search-nspkg-3.0.1-3.10.noarch.rpm"
RPM_HASH = "bd79308d14f9015a55d12b941d96b802721e23b52606a597aca81bcd735a4b24239ce25ae2c3aacc89d9950ce8ce8490d19895b6f34bd6fcaa567d03476620c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-nspkg \
python3.11dist-azure-cognitiveservices-search-nspkg \
python311-azure-cognitiveservices-search-nspkg \
python3dist-azure-cognitiveservices-search-nspkg"

RDEPENDS:${PN} += "python311-azure-cognitiveservices-nspkg \
python311-azure-nspkg"

inherit rpm
