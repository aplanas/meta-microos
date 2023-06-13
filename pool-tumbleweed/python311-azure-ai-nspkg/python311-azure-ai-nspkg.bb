SUMMARY = "Microsoft Azure AI namespace package"
DESCRIPTION = "This is the Microsoft Azure AI namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-ai-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "7d7269611b5044544c088a3fd952258bb639e043d42e61043771e8b9efc5f14de227503f8fe4ef9aa9f5b87a0107f7e030c787234c55c97574c32ceb7bec594e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-ai-nspkg) \
python311-azure-ai-nspkg \
python3dist(azure-ai-nspkg)"

RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm
