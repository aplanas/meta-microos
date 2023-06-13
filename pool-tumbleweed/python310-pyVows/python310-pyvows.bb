SUMMARY = "BDD test engine based on Vows.js"
DESCRIPTION = "pyVows is a BDD test engine based on Vows.js <http://vowsjs.org>."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-pyVows-3.0.0-2.13.noarch.rpm"
RPM_HASH = "53b20eb08e6268b059cdb8cdad47646a341e431abbb4076fa05b3430331397b8d511b3c1202fb775dbeff0421500aafb3cd11dda2b7ad0434e7febc4aaedfc88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyVows \
python3.10dist(pyvows) \
python310-pyVows \
python3dist(pyvows)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Unidecode \
python310-gevent \
python310-preggy \
update-alternatives"

inherit rpm
