SUMMARY = "Python module for Libravatar"
DESCRIPTION = "PyLibravatar is a module for using federated Libravatar \
avatar hosting service from within Python applications."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python311-pyLibravatar-1.7-3.12.noarch.rpm"
RPM_HASH = "8e33f5a798969c282d2d0ee243784b4d337a60cc62e25243486cbdb6136584fd53fb7bc76e1d9e9c9cf583cd09ae6094fb09276bd8baf0d37527c29af6b793f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pylibravatar \
python311-pyLibravatar \
python3dist-pylibravatar"

RDEPENDS:${PN} += "python-abi \
python311-py3dns"

inherit rpm
