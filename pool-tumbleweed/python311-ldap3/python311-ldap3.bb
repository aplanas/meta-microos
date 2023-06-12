SUMMARY = "A strictly RFC 4511 conforming LDAP V3 pure Python client"
DESCRIPTION = "ldap3 is a strictly RFC 4511 conforming LDAP V3 pure Python **client**. \
The same codebase works with Python, Python 3, PyPy and PyPy3. \
 \
This project was formerly named **python3-ldap**. \
The name has been changed to avoid confusion with the python-ldap library."
LICENSE = "LGPL-3.0-only"

PV = "2.9.1"

RPM_NAME = "python311-ldap3-2.9.1-1.10.noarch.rpm"
RPM_HASH = "dd569089f3542158e6c2920188febd7e1b4cb7427b2d570f58bea4e989cc0da79706593a523fed020fd2b4e8c4a6174462cd9d6c6180ed4526488773f26a591c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ldap3) \
python311-ldap3 \
python3dist(ldap3)"
RDEPENDS:${PN} += "python(abi) \
python311-pyasn1"

inherit rpm
