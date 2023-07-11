SUMMARY = "Microsoft Azure Storage namespace package"
DESCRIPTION = "This is the Microsoft Azure Storage namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.storage namespace."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-azure-storage-nspkg-3.1.0-2.12.noarch.rpm"
RPM_HASH = "6b63ab187fcf34f076c67e7ba5f224a3272a6ed0abeaa402637faed5183d38682204021ea528f3b8a4dd3c28bd357ab6465da62ae3550b99c32b93774dd36054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-storage-nspkg \
python310-azure-storage-nspkg \
python3dist-azure-storage-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm
