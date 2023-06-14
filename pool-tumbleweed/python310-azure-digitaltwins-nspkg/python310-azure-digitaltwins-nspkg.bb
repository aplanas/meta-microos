SUMMARY = "Microsoft Azure Digitaltwins Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.digitaltwins namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-digitaltwins-nspkg-1.0.0-1.10.noarch.rpm"
RPM_HASH = "3f1b27c14a2ba48f73c8b4ee7a4b5daa4d05b6fdcd32b3949ec5120ac1c6b4220904ff21e51176ee1bd9f5fc08a23f45f58e41575757d49461e4924a81389049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-digitaltwins-nspkg \
python3.10dist-azure-digitaltwins-nspkg \
python310-azure-digitaltwins-nspkg \
python3dist-azure-digitaltwins-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm
