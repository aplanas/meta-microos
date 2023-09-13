SUMMARY = "Active Directory information dumper via LDAP"
DESCRIPTION = "Active Directory information dumper via LDAP."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python311-ldapdomaindump-0.9.4-2.1.noarch.rpm"
RPM_HASH = "a1f8f8151c5451184a347cb9a1a5bc231587df6f0cf0cca40f42783cf0892674e58706fa040f85fdb9782528bf0d164f6e24ed046fff8d0ea7fdd519ae40e2cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ldapdomaindump \
python3.11dist-ldapdomaindump \
python311-ldapdomaindump \
python3dist-ldapdomaindump"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-dnspython \
python311-ldap3 \
update-alternatives"

inherit rpm
