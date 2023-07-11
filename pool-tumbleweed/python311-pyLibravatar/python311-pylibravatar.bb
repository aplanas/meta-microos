SUMMARY = "Python module for Libravatar"
DESCRIPTION = "PyLibravatar is a module for using federated Libravatar \
avatar hosting service from within Python applications."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python311-pyLibravatar-1.7-3.14.noarch.rpm"
RPM_HASH = "fc0ff351db4b62e6d8559d1124d01198264941e5ada012a16300176cece18b55d2cebed57ce60f536197105bd8aff822a57565aed2cd11f44f734aebdf6c60bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyLibravatar \
python3.11dist-pylibravatar \
python311-pyLibravatar \
python3dist-pylibravatar"

RDEPENDS:${PN} += "python-abi \
python311-py3dns"

inherit rpm
