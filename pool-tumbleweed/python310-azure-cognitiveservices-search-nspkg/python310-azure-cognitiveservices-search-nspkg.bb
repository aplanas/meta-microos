SUMMARY = "Microsoft Azure Cognitive Services Search namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Search namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.search namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-azure-cognitiveservices-search-nspkg-3.0.1-3.10.noarch.rpm"
RPM_HASH = "d89d3f8bcb590f3a772dcac02f3fd3efeabb22f4e9f782d70d375726c52f925861fc738f031840a6f9fa640f45c9e2c01819a7c3eeae97691957a9a1aa1b732c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cognitiveservices-search-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python3dist-azure-cognitiveservices-search-nspkg"

RDEPENDS:${PN} += "python310-azure-cognitiveservices-nspkg \
python310-azure-nspkg"

inherit rpm
