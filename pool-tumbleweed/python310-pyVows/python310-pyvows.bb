SUMMARY = "BDD test engine based on Vows.js"
DESCRIPTION = "pyVows is a BDD test engine based on Vows.js <http://vowsjs.org>."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-pyVows-3.0.0-2.15.noarch.rpm"
RPM_HASH = "b982e1e2c6f47edc6c50184944dfe0af17b56f8b1d78238d9f6d18286560b51db4d7359740f4b089317ad231480b675c6336fd1e089babdf4d06d253ed6251f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyvows \
python310-pyVows \
python3dist-pyvows"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Unidecode \
python310-gevent \
python310-preggy \
update-alternatives"

inherit rpm
