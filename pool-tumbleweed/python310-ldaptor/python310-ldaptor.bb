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

RPM_NAME = "python310-ldaptor-21.2.0-3.3.noarch.rpm"
RPM_HASH = "3f95c92f2bfdc28e655baf4da143f69ec4cf9a437275de106723aa91ad8590a82e27f558098bb3844993a6f5efbe58b53a2b647dac60e562c37345914f3d13a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ldaptor \
python310-ldaptor \
python3dist-ldaptor"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Twisted-tls \
python310-passlib \
python310-pyparsing \
python310-zope.interface \
update-alternatives"

inherit rpm
