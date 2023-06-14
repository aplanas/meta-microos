SUMMARY = "Active Directory information dumper via LDAP"
DESCRIPTION = "Active Directory information dumper via LDAP."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python311-ldapdomaindump-0.9.4-1.4.noarch.rpm"
RPM_HASH = "d35e6049357f89594eeeae7736fecf24a4bf90b96221c81e69bfcaac006e394420e442481bbff209f6857f507af0c40124d847299f1a4077f24b741128450cfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ldapdomaindump \
python311-ldapdomaindump \
python3dist-ldapdomaindump"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-dnspython \
python311-future \
python311-ldap3"

inherit rpm
