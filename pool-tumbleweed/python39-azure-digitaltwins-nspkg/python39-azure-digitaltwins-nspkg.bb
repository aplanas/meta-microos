SUMMARY = "Microsoft Azure Digitaltwins Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.digitaltwins namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-digitaltwins-nspkg-1.0.0-1.11.noarch.rpm"
RPM_HASH = "6dc6541941354144c558b1d2f7d015cff4316a70be09ccd2d8ddd9a0f59b800d537d00f471cd077a6948ff3854d1d75bdf612fc066b6b217c808416ae1d72316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-digitaltwins-nspkg \
python39-azure-digitaltwins-nspkg \
python3dist-azure-digitaltwins-nspkg"

RDEPENDS:${PN} += "python-abi \
python39-azure-nspkg"

inherit rpm
