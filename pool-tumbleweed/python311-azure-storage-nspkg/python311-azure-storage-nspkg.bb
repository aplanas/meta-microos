SUMMARY = "Microsoft Azure Storage namespace package"
DESCRIPTION = "This is the Microsoft Azure Storage namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.storage namespace."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-azure-storage-nspkg-3.1.0-2.12.noarch.rpm"
RPM_HASH = "efcc064b6b29be9bcc505280d2f288ecf1dcc465ffc2bc28d533a49e4812daa2fbf246e713506f2c152855836ee57ac05fee0f45887050d757e907766f1f6107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-nspkg \
python3.11dist-azure-storage-nspkg \
python311-azure-storage-nspkg \
python3dist-azure-storage-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm
