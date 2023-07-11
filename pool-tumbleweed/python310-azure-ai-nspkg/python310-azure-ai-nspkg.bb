SUMMARY = "Microsoft Azure AI namespace package"
DESCRIPTION = "This is the Microsoft Azure AI namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-ai-nspkg-1.0.0-3.10.noarch.rpm"
RPM_HASH = "7a98db90067ac1c02b7911dce156026aa1fe9988c372760a21acb3a902afcf667a65e98c00d4380846bc91910a0f5239043b05e6eb70347335999b8045261cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-ai-nspkg \
python310-azure-ai-nspkg \
python3dist-azure-ai-nspkg"

RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm
