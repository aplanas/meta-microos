SUMMARY = "Active Directory information dumper via LDAP"
DESCRIPTION = "Active Directory information dumper via LDAP."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python310-ldapdomaindump-0.9.4-1.6.noarch.rpm"
RPM_HASH = "dff43edbe96b682b3c93e0ccdc5cb79f6a0c17844bc686dd277837bcc223f8b3ee8a0f6f95acfb233fc69b7a49809fbdb4485a036a81c536d01fc3d38bf6bc1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ldapdomaindump \
python310-ldapdomaindump \
python3dist-ldapdomaindump"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-dnspython \
python310-future \
python310-ldap3"

inherit rpm
