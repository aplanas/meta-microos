SUMMARY = "A Pure-Python Twisted library for LDAP"
DESCRIPTION = "Ldaptor is a pure-Python library that implements: \
 \
- LDAP client logic \
- separately-accessible LDAP and BER protocol message generation/parsing \
- ASCII-format LDAP filter generation and parsing \
- LDIF format data generation \
- Samba password changing logic"
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python39-ldaptor-21.2.0-3.3.noarch.rpm"
RPM_HASH = "a244ad3131d329708841865bca2da2850a63cbdd6f9fc4fc4ee9622bab171e24001b8c74a047c9d636bef2fa26c82079385972c6cc0433627be815cf4063bb9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ldaptor \
python39-ldaptor \
python3dist-ldaptor"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Twisted-tls \
python39-passlib \
python39-pyparsing \
python39-zope.interface \
update-alternatives"

inherit rpm
