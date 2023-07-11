SUMMARY = "A strictly RFC 4511 conforming LDAP V3 pure Python client"
DESCRIPTION = "ldap3 is a strictly RFC 4511 conforming LDAP V3 pure Python **client**. \
The same codebase works with Python, Python 3, PyPy and PyPy3. \
 \
This project was formerly named **python3-ldap**. \
The name has been changed to avoid confusion with the python-ldap library."
LICENSE = "LGPL-3.0-only"

PV = "2.9.1"

RPM_NAME = "python310-ldap3-2.9.1-2.2.noarch.rpm"
RPM_HASH = "1cfd98238ac794f09ba0516a280bbeb1b915d557cc933514e803f78fbb1118c8ad21a45af955e1822dd5c78e5baca77454e311aeda78ede03dddb4d34001855d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ldap3 \
python310-ldap3 \
python3dist-ldap3"

RDEPENDS:${PN} += "python-abi \
python310-pyasn1"

inherit rpm
