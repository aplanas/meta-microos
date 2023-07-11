SUMMARY = "A Python library to interact with Apache HBase"
DESCRIPTION = "HappyBase is a Python library to interact with Apache HBase."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-happybase-1.2.0-3.9.noarch.rpm"
RPM_HASH = "1ce34617a1ccadd6016e01fd02bbd2b49a4f1a47dc1facba143289ba3f9a6bc90b8f8cbc34378472f5d5b23bb00d6a5fa5c9613fa5e596ed970841a1c0c1102e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-happybase \
python310-happybase \
python3dist-happybase"

RDEPENDS:${PN} += "python-abi \
python310-six \
python310-thriftpy2"

inherit rpm
