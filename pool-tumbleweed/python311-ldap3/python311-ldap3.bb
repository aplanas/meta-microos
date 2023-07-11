SUMMARY = "A strictly RFC 4511 conforming LDAP V3 pure Python client"
DESCRIPTION = "ldap3 is a strictly RFC 4511 conforming LDAP V3 pure Python **client**. \
The same codebase works with Python, Python 3, PyPy and PyPy3. \
 \
This project was formerly named **python3-ldap**. \
The name has been changed to avoid confusion with the python-ldap library."
LICENSE = "LGPL-3.0-only"

PV = "2.9.1"

RPM_NAME = "python311-ldap3-2.9.1-2.2.noarch.rpm"
RPM_HASH = "86e4f609182b0ff7087551bd861adeacd34b4a9168834c7624b61ba2ba3bd44f49795d501562ba1d886f6818e418134a6f7a778d1b3fb8cd0bd6f48df9447273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ldap3 \
python3.11dist-ldap3 \
python311-ldap3 \
python3dist-ldap3"

RDEPENDS:${PN} += "python-abi \
python311-pyasn1"

inherit rpm
