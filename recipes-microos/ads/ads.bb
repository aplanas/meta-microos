SUMMARY = "Swiss army knife for samba"
DESCRIPTION = "Active Directory services tool for samba. \
For join, unjoin, provisioning, demotion, user/group and password administration, \
ldap attribute modification, posix enablement, kdc timesync, pam and nss configuration, \
daemon start/stop, cache flush, etc. \
The ads command attempts to maintain compatibility with the proprietary vastool command, \
while also adding additional features relevant to samba (such as kdc provisioning)."
LICENSE = "GPL-3.0-only"

PV = "2.0+git.0.bdc680d"

RPM_NAME = "ads-2.0+git.0.bdc680d-1.8.noarch.rpm"
RPM_HASH = "799a0d4b6dc1ffe703c95f2d18fd08157e4e8ee343a1c486d530468fac5c76390a7e182c4a4914d621416092749732c5b2a956ef228c77ae52004817ed0a7cf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ads vasclnt vastool"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 krb5-client ntp python3-dnspython python3-ldb python3-netifaces python3-psutil python3-python-pam samba-client samba-dsdb-modules samba-python3"

inherit rpm
