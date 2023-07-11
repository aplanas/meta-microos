SUMMARY = "Active Directory information dumper via LDAP"
DESCRIPTION = "Active Directory information dumper via LDAP."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python39-ldapdomaindump-0.9.4-1.6.noarch.rpm"
RPM_HASH = "d7ee914e7427a8ffca5bc08c53a2e4408a1ef527d587e0657f5369138976c231593d771edaec5c844ae83b9ef3418642aac184edc0c0876391700784eb0424fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ldapdomaindump \
python39-ldapdomaindump \
python3dist-ldapdomaindump"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-dnspython \
python39-future \
python39-ldap3"

inherit rpm
