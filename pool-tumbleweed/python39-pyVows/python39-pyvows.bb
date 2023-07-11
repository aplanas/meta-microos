SUMMARY = "BDD test engine based on Vows.js"
DESCRIPTION = "pyVows is a BDD test engine based on Vows.js <http://vowsjs.org>."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-pyVows-3.0.0-2.15.noarch.rpm"
RPM_HASH = "8478779b48dd134e6887b4c841d1a4203696ff040a3aac164be9b47be222b989585fc0b6b522b5b136cab9c6fb2e2d4ebcd47f774d588f5ea69b0014caf5d9ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyvows \
python39-pyVows \
python3dist-pyvows"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Unidecode \
python39-gevent \
python39-preggy \
update-alternatives"

inherit rpm
