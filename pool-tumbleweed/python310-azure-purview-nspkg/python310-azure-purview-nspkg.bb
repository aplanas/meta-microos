SUMMARY = "Microsoft Azure Purview Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Purview namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.purview namespace."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-purview-nspkg-2.0.0-1.9.noarch.rpm"
RPM_HASH = "c72becefca8c025e6f0b2368ef009fbc9b3cbef1e6cd187efa3889eaf368fd72ad88b5237187e6492eeebd58f5a9181935f5830cafebe99267d4be0837d4b1fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-purview-nspkg \
python310-azure-purview-nspkg \
python3dist-azure-purview-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm
