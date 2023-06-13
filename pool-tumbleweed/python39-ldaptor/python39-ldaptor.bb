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

RPM_NAME = "python39-ldaptor-21.2.0-2.8.noarch.rpm"
RPM_HASH = "cfde88ade4371ddf20d9f766a1722816134200540dff97855bc0207a626ee76fc8284f391671a500017fe7692d81527892df277927823307d9ccbc44b34b9a6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ldaptor) \
python39-ldaptor \
python3dist(ldaptor)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Twisted-tls \
python39-passlib \
python39-pyparsing \
python39-zope.interface \
update-alternatives"

inherit rpm
