SUMMARY = "A strictly RFC 4511 conforming LDAP V3 pure Python client"
DESCRIPTION = "ldap3 is a strictly RFC 4511 conforming LDAP V3 pure Python **client**. \
The same codebase works with Python, Python 3, PyPy and PyPy3. \
 \
This project was formerly named **python3-ldap**. \
The name has been changed to avoid confusion with the python-ldap library."
LICENSE = "LGPL-3.0-only"

PV = "2.9.1"

RPM_NAME = "python39-ldap3-2.9.1-2.2.noarch.rpm"
RPM_HASH = "76784f3c9bcc4c8fb4778d85458aedad502f913ab5cfa2d2e5a72dcccc436f9effeda054728b3c932e49d2c80428f15438ffc144a68b88951cf7fd2cb32540c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ldap3 \
python39-ldap3 \
python3dist-ldap3"

RDEPENDS:${PN} += "python-abi \
python39-pyasn1"

inherit rpm
