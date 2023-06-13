SUMMARY = "Active Directory information dumper via LDAP"
DESCRIPTION = "Active Directory information dumper via LDAP."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python39-ldapdomaindump-0.9.4-1.4.noarch.rpm"
RPM_HASH = "a3f332f030b992449b4456d6cecf9bf9f5af045a4d517972abb5228ef4b7dff17e950ebf2ffe0a70329f057d9533d2eb17580a670d2945e837bfc42db089e1cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ldapdomaindump) \
python39-ldapdomaindump \
python3dist(ldapdomaindump)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-dnspython \
python39-future \
python39-ldap3"

inherit rpm
