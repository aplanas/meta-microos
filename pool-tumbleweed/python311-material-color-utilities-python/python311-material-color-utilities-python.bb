SUMMARY = "Python port of material-color-utilities used for Material You colors"
DESCRIPTION = "Python port of material-color-utilities used for Material You colors."
LICENSE = "Apache-2.0"

PV = "0.1.5"

RPM_NAME = "python311-material-color-utilities-python-0.1.5-1.5.noarch.rpm"
RPM_HASH = "a76eccc643c0a4477907e66d34c7ef0fedf7a91fae9a5fbab91b25533a532f62455bb123ae85bfb789672f8b394361a3f720156dd79732a792b29121758c3ca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-material-color-utilities-python \
python3.11dist-material-color-utilities-python \
python311-material-color-utilities-python \
python3dist-material-color-utilities-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
