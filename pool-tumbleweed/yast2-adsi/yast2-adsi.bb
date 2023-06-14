SUMMARY = "Active Directory Compatible Service Interfaces Editor"
DESCRIPTION = "The ADSI Edit for YaST module provides tools for viewing and modifying \
an LDAP tree."
LICENSE = "GPL-3.0-only"

PV = "1.6"

RPM_NAME = "yast2-adsi-1.6-1.14.noarch.rpm"
RPM_HASH = "03488eaee9ea017c153cafcdd02f2703b2d12562ec022801abb6e3f46b7770aa01340559d44ef66097b2e5786f77b189f4db448e2fc9f91eb74b0d9725d4998f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-adsi"

RDEPENDS:${PN} += "krb5-client \
python3-ldap \
samba-client \
samba-python3 \
yast2 \
yast2-adcommon-python \
yast2-python3-bindings"

inherit rpm
