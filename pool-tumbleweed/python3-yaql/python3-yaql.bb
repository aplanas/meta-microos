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

RPM_NAME = "python3-yaql-2.0.0-2.3.noarch.rpm"
RPM_HASH = "3e8a1fa6e276f0bdfd75cb9db4b2688fac2467a6b581c09c14fe90b735a20865b6670860d009813175da8e23e71fb7f918ac37b8549a1b9f1568052f2b8478d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yaql \
python3.11dist-yaql \
python3dist-yaql"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Babel \
python3-ply \
python3-python-dateutil"

inherit rpm
