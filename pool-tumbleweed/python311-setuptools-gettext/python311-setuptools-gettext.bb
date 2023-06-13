SUMMARY = "Setuptools gettext extension plugin"
DESCRIPTION = "Setuptools gettext extension plugin"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "python311-setuptools-gettext-0.1.1-1.3.noarch.rpm"
RPM_HASH = "175ff4e57ea9780e654a05574b6abf119e057aa7600675dd94fe163bf63f3d3cca29defa0517c16d23a918c5fdb08a5cab7687146cf110c93a2560b5184dab2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(setuptools-gettext) \
python311-setuptools-gettext \
python3dist(setuptools-gettext)"

RDEPENDS:${PN} += "python(abi) \
python311-setuptools"

inherit rpm
