SUMMARY = "A Python library to interact with Apache HBase"
DESCRIPTION = "HappyBase is a Python library to interact with Apache HBase."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-happybase-1.2.0-3.7.noarch.rpm"
RPM_HASH = "700be436a6ee5019e863329ce76a6c8734b5c9f44b4f506a7e98391abf976155cebb646c8216d4c8cd8d8faf6f140c0463e5aea2595e6e1a1ed8f499099f3d07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-happybase \
python311-happybase \
python3dist-happybase"

RDEPENDS:${PN} += "python-abi \
python311-six \
python311-thriftpy2"

inherit rpm
