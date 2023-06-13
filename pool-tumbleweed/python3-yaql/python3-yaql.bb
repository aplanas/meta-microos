SUMMARY = "YAQL - Yet Another Query Language"
DESCRIPTION = "YAQL (Yet Another Query Language) is an embeddable and extensible query \
language, that allows performing complex queries against arbitrary objects. It \
has a vast and comprehensive standard library of frequently used querying \
functions and can be extend even further with user-specified functions. YAQL is \
written in python and is distributed via PyPI. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "python3-yaql-2.0.0-2.2.noarch.rpm"
RPM_HASH = "ecc600c2d9fdb68d019cf57ec9f2a1432ee77a39a7ba7f9e8270ee3e036c153fac93e72a300a2a2bdc62ac6fcbab0ccc538bc9455c250a0ae4f3c8c80ed0126e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yaql \
python3.10dist(yaql) \
python3dist(yaql)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-Babel \
python3-ply \
python3-python-dateutil"

inherit rpm
