SUMMARY = "Microsoft Azure AI namespace package"
DESCRIPTION = "This is the Microsoft Azure AI namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-ai-nspkg-1.0.0-3.10.noarch.rpm"
RPM_HASH = "43a393d2da2bffb69e03af3a5c5453f47ac840d76f48805c1241f9c1fa092c8ddcceb2ced43b21615faf8daf19840cba525eb7d75e7e2909345bd7bd9b3531e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-ai-nspkg \
python39-azure-ai-nspkg \
python3dist-azure-ai-nspkg"

RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm
