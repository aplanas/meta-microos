SUMMARY = "A strictly RFC 4511 conforming LDAP V3 pure Python client"
DESCRIPTION = "ldap3 is a strictly RFC 4511 conforming LDAP V3 pure Python **client**. \
The same codebase works with Python, Python 3, PyPy and PyPy3. \
 \
This project was formerly named **python3-ldap**. \
The name has been changed to avoid confusion with the python-ldap library."
LICENSE = "LGPL-3.0-only"

PV = "2.9.1"

RPM_NAME = "python310-ldap3-2.9.1-1.10.noarch.rpm"
RPM_HASH = "85ef043f1670ba745de0e1cf5278a78d1a8c81a27c5c8a7ef6787ce18e89bbfb3b9d3a678a1965df22a53aede1f80cd3f464064cf2013ca94741d63e21daddd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ldap3 \
python3.10dist-ldap3 \
python310-ldap3 \
python3dist-ldap3"

RDEPENDS:${PN} += "python-abi \
python310-pyasn1"

inherit rpm
