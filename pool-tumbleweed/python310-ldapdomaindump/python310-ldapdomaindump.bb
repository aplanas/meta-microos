SUMMARY = "Active Directory information dumper via LDAP"
DESCRIPTION = "Active Directory information dumper via LDAP."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python310-ldapdomaindump-0.9.4-2.1.noarch.rpm"
RPM_HASH = "df19387e0463202619a4d71cc130221ac77fc63eb9f04dd67973bc428ef33f6322c6dd6ea42dafb898d6c6b1dd60533452f58884f3ac497181ba8b7c5660e561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ldapdomaindump \
python310-ldapdomaindump \
python3dist-ldapdomaindump"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-dnspython \
python310-ldap3 \
update-alternatives"

inherit rpm
