SUMMARY = "Microsoft Azure Digitaltwins Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.digitaltwins namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-digitaltwins-nspkg-1.0.0-1.10.noarch.rpm"
RPM_HASH = "362ce6ebdb61e6ca4796005df33138725222bfd1bc4469f0290de6b59d7e3463d6aa981e2f4ef9069742bb7fe806b58e6ec734bf607100b269cb0ac64626b99b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-digitaltwins-nspkg \
python311-azure-digitaltwins-nspkg \
python3dist-azure-digitaltwins-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm
