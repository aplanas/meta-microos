SUMMARY = "Microsoft Azure AI namespace package"
DESCRIPTION = "This is the Microsoft Azure AI namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-ai-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "0864c954a0e1cf8851bea4334dbef1a5d9862e29bfabdbca1b72cc04d9c432026bdf6437c11c253888eac086402562c4f3e35a3984d0f027c3e24b5daed78124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-ai-nspkg \
python39-azure-ai-nspkg \
python3dist-azure-ai-nspkg"

RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm
