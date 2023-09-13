SUMMARY = "Active Directory information dumper via LDAP"
DESCRIPTION = "Active Directory information dumper via LDAP."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python39-ldapdomaindump-0.9.4-2.1.noarch.rpm"
RPM_HASH = "aa8784f5c9dd4a2b7089dea138532d278711f9bbe1742b2881f8558904e325b8826f4ac4c8084abdb7194b2a1f250e67baa531439086dc4362612717fc258d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ldapdomaindump \
python39-ldapdomaindump \
python3dist-ldapdomaindump"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-dnspython \
python39-ldap3 \
update-alternatives"

inherit rpm
