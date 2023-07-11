SUMMARY = "Microsoft Azure Storage namespace package"
DESCRIPTION = "This is the Microsoft Azure Storage namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.storage namespace."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-azure-storage-nspkg-3.1.0-2.12.noarch.rpm"
RPM_HASH = "673dc770736979fccc50a0baf7460e2b34a927fd86e9e68572fb8654f8c5835dde732f49023c4affdd2ffe3f5adaec738ff0bacd4611ca97cbf2a621ebb72332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-storage-nspkg \
python39-azure-storage-nspkg \
python3dist-azure-storage-nspkg"

RDEPENDS:${PN} += "python-abi \
python39-azure-nspkg"

inherit rpm
