SUMMARY = "Active Directory information dumper via LDAP"
DESCRIPTION = "Active Directory information dumper via LDAP."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python311-ldapdomaindump-0.9.4-1.6.noarch.rpm"
RPM_HASH = "d49f65fdb1bed9f11e56969c3ab2d9e35b31aa5c9c25ab11f392743aef32c0ae831da465092de34a406530ffe2050f4b01977e6ef3b5558ccfbab6852188ffe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ldapdomaindump \
python3.11dist-ldapdomaindump \
python311-ldapdomaindump \
python3dist-ldapdomaindump"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-dnspython \
python311-future \
python311-ldap3"

inherit rpm
