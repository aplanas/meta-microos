SUMMARY = "Python module for Libravatar"
DESCRIPTION = "PyLibravatar is a module for using federated Libravatar \
avatar hosting service from within Python applications."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python39-pyLibravatar-1.7-3.14.noarch.rpm"
RPM_HASH = "67fea4b027b471e5505b81ace375685b884960c82ed3c70862f9e49970aa4b4334b59525566b16da61ebd9521d4ab952cf3e318c66e58397e10758fc167641c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylibravatar \
python39-pyLibravatar \
python3dist-pylibravatar"

RDEPENDS:${PN} += "python-abi \
python39-py3dns"

inherit rpm
