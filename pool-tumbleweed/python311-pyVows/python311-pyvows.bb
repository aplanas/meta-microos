SUMMARY = "BDD test engine based on Vows.js"
DESCRIPTION = "pyVows is a BDD test engine based on Vows.js <http://vowsjs.org>."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-pyVows-3.0.0-2.15.noarch.rpm"
RPM_HASH = "70d2038fe44ddd375a07b024f217aad3f25101f6b0b31982c76c622f4b4bd97eede8024b5d39d7aab7abedabb1094b9c330e60be3d1255088f3be51053cf642e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyVows \
python3.11dist-pyvows \
python311-pyVows \
python3dist-pyvows"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Unidecode \
python311-gevent \
python311-preggy \
update-alternatives"

inherit rpm
