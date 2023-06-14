SUMMARY = "Microsoft Azure CLI Command modules Namespace Package"
DESCRIPTION = "Microsoft Azure CLI Command modules Namespace Package \
 \
This is the Microsoft Azure CLI command module namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure cli command module namespaces."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "azure-cli-command-modules-nspkg-2.0.3-1.10.noarch.rpm"
RPM_HASH = "b54957e873af8a26a2bb4f642647038ef612124cf37f2d3d81baf1c8ee548a2e90c2c2b959173bd14aaed1202adf0e208d7cb9b868eac7b8b6bba44ea05cf4a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azure-cli-command-modules-nspkg \
python3.10dist-azure-cli-command-modules-nspkg \
python3dist-azure-cli-command-modules-nspkg"

RDEPENDS:${PN} += "azure-cli-nspkg \
python-abi \
python3-azure-nspkg"

inherit rpm
