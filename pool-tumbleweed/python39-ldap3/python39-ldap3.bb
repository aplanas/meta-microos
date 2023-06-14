SUMMARY = "A strictly RFC 4511 conforming LDAP V3 pure Python client"
DESCRIPTION = "ldap3 is a strictly RFC 4511 conforming LDAP V3 pure Python **client**. \
The same codebase works with Python, Python 3, PyPy and PyPy3. \
 \
This project was formerly named **python3-ldap**. \
The name has been changed to avoid confusion with the python-ldap library."
LICENSE = "LGPL-3.0-only"

PV = "2.9.1"

RPM_NAME = "python39-ldap3-2.9.1-1.10.noarch.rpm"
RPM_HASH = "56cb1c6bc6184d76c1fe9ca5dea34a0c2ef83c8d2103561bf5a48fc6ea3d99218d7dc410699d2a7cad373b0528113b5fe01340b5cac18b3917cdcd98fcd31695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ldap3 \
python39-ldap3 \
python3dist-ldap3"

RDEPENDS:${PN} += "python-abi \
python39-pyasn1"

inherit rpm
