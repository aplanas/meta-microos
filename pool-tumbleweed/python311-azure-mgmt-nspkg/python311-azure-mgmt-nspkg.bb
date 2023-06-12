SUMMARY = "Microsoft Azure Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python311-azure-mgmt-nspkg-3.0.2-3.9.noarch.rpm"
RPM_HASH = "668c0146bbe1653abae8e60b2717779ef58892da832ba97a9b8e9de4e7962d7046193318b7cf6d562ddc17f522ff144e8aca3a9c45f4c20454d3d26252b31b9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-nspkg) \
python311-azure-mgmt-nspkg \
python3dist(azure-mgmt-nspkg)"
RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm
