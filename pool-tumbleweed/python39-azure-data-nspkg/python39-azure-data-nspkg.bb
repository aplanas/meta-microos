SUMMARY = "Microsoft Azure Data Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Data namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.data namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-data-nspkg-1.0.0-2.11.noarch.rpm"
RPM_HASH = "5d27eeeeaec6b01495542e326f7d202001499966095fcd6b25845a5fa6b6c360d6904526b5a0035775df1f7e1b1a7fd33acbe1f30de886df812f077d00aa4773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-data-nspkg) \
python39-azure-data-nspkg \
python3dist(azure-data-nspkg)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-nspkg"

inherit rpm
