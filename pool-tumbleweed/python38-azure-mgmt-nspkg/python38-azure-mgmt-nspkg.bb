SUMMARY = "Microsoft Azure Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python38-azure-mgmt-nspkg-3.0.2-3.9.noarch.rpm"
RPM_HASH = "8626e4bce9f574a81b97ea2400c0513bcd67dfcd2776484677f2e1479d59d55cd35efbd7264cde6d3cc22b96922fb7ab5462fe10f1b70d25e05680895f54813d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-azure-mgmt-nspkg \
python38-azure-mgmt-nspkg \
python3dist-azure-mgmt-nspkg"

RDEPENDS:${PN} += "python38-azure-nspkg"

inherit rpm
