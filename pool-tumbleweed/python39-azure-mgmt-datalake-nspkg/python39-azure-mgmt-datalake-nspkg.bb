SUMMARY = "Microsoft Azure Data Lake Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Data Lake Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt.datalake namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-azure-mgmt-datalake-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "b26d5a0c6b88f21c04fc03e739f0b5ebd80ce833de4f814f3954d01976621fb529e0ad67c2df4af9373b4eecaab458f9aefa0c9bd9a2b45b9498b18dca330e5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-datalake-nspkg) \
python39-azure-mgmt-datalake-nspkg \
python3dist(azure-mgmt-datalake-nspkg)"

RDEPENDS:${PN} += "python39-azure-mgmt-nspkg \
python39-azure-nspkg"

inherit rpm
