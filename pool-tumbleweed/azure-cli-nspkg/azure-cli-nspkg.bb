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

RPM_NAME = "azure-cli-nspkg-3.0.4-2.4.noarch.rpm"
RPM_HASH = "3277e2543a9e422f609c5824fca7de596ef079ebbe0846a57ddd3310023784d091666a8d5c1bc95de457d81e34f73c548a1d54206c0ba61da45512a072d037e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azure-cli-nspkg \
python3.11dist-azure-cli-nspkg \
python3dist-azure-cli-nspkg"

RDEPENDS:${PN} += "python-abi \
python3-azure-nspkg"

inherit rpm
