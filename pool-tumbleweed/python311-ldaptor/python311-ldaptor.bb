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

RPM_NAME = "python311-ldaptor-21.2.0-3.3.noarch.rpm"
RPM_HASH = "e39ad069585346d3c120768098fe6feb3f3361140983cb14332129b982dce2bc2ce6b71967ba107d3ec7d8fc1e8e0b4b0eef06faf95d8db8f24bede706e30160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ldaptor \
python3.11dist-ldaptor \
python311-ldaptor \
python3dist-ldaptor"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Twisted-tls \
python311-passlib \
python311-pyparsing \
python311-zope.interface \
update-alternatives"

inherit rpm
