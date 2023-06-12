SUMMARY = "Microsoft Azure Storage namespace package"
DESCRIPTION = "This is the Microsoft Azure Storage namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.storage namespace."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-azure-storage-nspkg-3.1.0-2.11.noarch.rpm"
RPM_HASH = "763b942cd2f3156a955d7cd86eed6de127c3b6d4b8b35cc125b65d7aba69aefa13f2cc1140efc30aa37b66f9c03dff22691914802309e95e9fdb6b2cc292af8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-storage-nspkg) \
python311-azure-storage-nspkg \
python3dist(azure-storage-nspkg)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-nspkg"

inherit rpm
