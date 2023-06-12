SUMMARY = "Microsoft Azure Data Lake Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Data Lake Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt.datalake namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python38-azure-mgmt-datalake-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "589a6af0d318b30ff577a1cb63f149ad3c48255441c9e65ea9baadc80ef00b79effa553937c1beab25a234f48530216e7b75f11f780a2fbcdd6ac53b7c771d00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(azure-mgmt-datalake-nspkg) \
python38-azure-mgmt-datalake-nspkg \
python3dist(azure-mgmt-datalake-nspkg)"
RDEPENDS:${PN} += "python38-azure-mgmt-nspkg \
python38-azure-nspkg"

inherit rpm
