SUMMARY = "Microsoft Azure namespace package"
DESCRIPTION = "This is the Microsoft Azure namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python311-azure-nspkg-3.0.2-3.9.noarch.rpm"
RPM_HASH = "0c7d5cec4360b4e4d4c257685d37563280b23f1d35da8b92cf372165e1f9257a81e7bc61afe9bbd3b2bb71a5e266e00cc5412d880ae4649b204efcff8b3168f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-nspkg \
python311-azure-nspkg \
python3dist-azure-nspkg"

RDEPENDS:${PN} += ""

inherit rpm
