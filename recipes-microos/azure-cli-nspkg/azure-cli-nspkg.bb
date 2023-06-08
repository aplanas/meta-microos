SUMMARY = "Microsoft Azure CLI Namespace Package"
DESCRIPTION = "Microsoft Azure CLI Namespace Package \
 \
This is the Microsoft Azure CLI namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure cli namespaces."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "azure-cli-nspkg-3.0.4-2.3.noarch.rpm"
RPM_HASH = "0cc7fa63ad8c6e69ac504cac9e9f5735d199d12ac34e38e553e00ac850738ee8a63bd453bed527938facca90b794efe324d8f7fca22170963b18fc9aecb5e359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azure-cli-nspkg python3.10dist(azure-cli-nspkg) python3dist(azure-cli-nspkg)"
RDEPENDS:${PN} += "python(abi) python3-azure-nspkg"

inherit rpm
