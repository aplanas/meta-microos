SUMMARY = "Group Policy Management Console for YaST"
DESCRIPTION = "The Group Policy Management console for YaST provides tools for creating and \
modifying Group Policy Objects in Active Directory."
LICENSE = "GPL-3.0-only"

PV = "1.5.1"

RPM_NAME = "yast2-gpmc-1.5.1-1.10.noarch.rpm"
RPM_HASH = "19807e828a06e4360f1cb1db9bd8289275a9db8d8f57aefb5b21cfe35062ad2776d97c9a8b7ec0567c735127ece2807ab6f2088f3f65f5bd42f8f27bbc371941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast-gpmc \
yast2-gpmc"

RDEPENDS:${PN} += "krb5-client \
python3-ldap \
samba-ad-dc \
samba-client \
samba-python3 \
yast2 \
yast2-adcommon-python \
yast2-python3-bindings"

inherit rpm
