SUMMARY = "A Python library to interact with Apache HBase"
DESCRIPTION = "HappyBase is a Python library to interact with Apache HBase."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-happybase-1.2.0-3.9.noarch.rpm"
RPM_HASH = "2eadf6cdee29ce9e7bd8309e8709460e2a52ff6c0a115710f1c112cdaa26f9724f89660483ab54f56f235d30cda596288fe5d6a8ed2fb740a6ce2906cb682da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-happybase \
python3.11dist-happybase \
python311-happybase \
python3dist-happybase"

RDEPENDS:${PN} += "python-abi \
python311-six \
python311-thriftpy2"

inherit rpm
