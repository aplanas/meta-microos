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

RPM_NAME = "python311-ldaptor-21.2.0-2.8.noarch.rpm"
RPM_HASH = "834a696dafac144e30a7e9428b03b2cf486e078f1778d8ca1a937e91f4944919ccc41c56fe025d5d0e02818b4b2a4423286d4cda225824ed79e3134b0b3aaf26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ldaptor \
python311-ldaptor \
python3dist-ldaptor"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-Twisted-tls \
python311-passlib \
python311-pyparsing \
python311-zope.interface \
update-alternatives"

inherit rpm
