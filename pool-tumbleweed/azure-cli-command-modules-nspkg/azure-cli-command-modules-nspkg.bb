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

RPM_NAME = "azure-cli-command-modules-nspkg-2.0.3-1.11.noarch.rpm"
RPM_HASH = "8efabfb6c8d5053321d2f1cdae37209d9f12e7bd91a5321e43011236b75d69b7ebd624593c219d5201bb4020217302785922e07769585be1dec139f8b159953a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azure-cli-command-modules-nspkg \
python3.11dist-azure-cli-command-modules-nspkg \
python3dist-azure-cli-command-modules-nspkg"

RDEPENDS:${PN} += "azure-cli-nspkg \
python-abi \
python3-azure-nspkg"

inherit rpm
