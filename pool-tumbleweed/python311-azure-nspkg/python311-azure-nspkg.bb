SUMMARY = "Microsoft Azure namespace package"
DESCRIPTION = "This is the Microsoft Azure namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python311-azure-nspkg-3.0.2-3.10.noarch.rpm"
RPM_HASH = "fdb947bc277f6e5325165e9654bfc1bb878160688fe3472f356cbb16bb35f415dbae0b820e4b5d3c51bb90e217b45adeb8433c2451f40db1e916530d1bb4d50c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-nspkg \
python3.11dist-azure-nspkg \
python311-azure-nspkg \
python3dist-azure-nspkg"

RDEPENDS:${PN} += ""

inherit rpm
