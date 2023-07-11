SUMMARY = "Module to resolve abstract dependencies into concrete ones"
DESCRIPTION = "A Python module to resolve abstract dependencies into concrete ones."
LICENSE = "ISC"

PV = "0.8.1"

RPM_NAME = "python39-resolvelib-0.8.1-7.3.noarch.rpm"
RPM_HASH = "de21041926db48a12334514fb95c444492f04eaf0495f42b4302207acbfde3bb61caaa311a199513990501fd4f98b9ec50795849292b8d2a960518da485c1ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-resolvelib \
python39-resolvelib \
python3dist-resolvelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
