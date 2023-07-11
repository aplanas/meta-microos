SUMMARY = "Microsoft Azure Digitaltwins Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.digitaltwins namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-digitaltwins-nspkg-1.0.0-1.11.noarch.rpm"
RPM_HASH = "163a92ba3471c88076b6b7ee4b832ceedeccb149b1cde0d8eaffc6411357b5427bc12c7326e390d51a74a4f8c7e54e306eb2312d1d85a0839a815bbec6dc4e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-digitaltwins-nspkg \
python3.11dist-azure-digitaltwins-nspkg \
python311-azure-digitaltwins-nspkg \
python3dist-azure-digitaltwins-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm
