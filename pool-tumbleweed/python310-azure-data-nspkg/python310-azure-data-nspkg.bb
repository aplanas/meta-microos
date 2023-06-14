SUMMARY = "Microsoft Azure Data Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Data namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.data namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-data-nspkg-1.0.0-2.11.noarch.rpm"
RPM_HASH = "77ea271b4d524a53a16fc990a50fc641783adf9414859b15b7504e1df277cea62fa64b8ce4e6e0521a1178289a03f011a51d9c3d51409837fc6f8f04794ad660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-data-nspkg \
python3.10dist-azure-data-nspkg \
python310-azure-data-nspkg \
python3dist-azure-data-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm
