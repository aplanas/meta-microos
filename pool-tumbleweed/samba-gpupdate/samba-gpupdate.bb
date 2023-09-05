SUMMARY = "Samba Group Policy"
DESCRIPTION = "The samba-gpupdate package provides the samba-gpupdate tool for applying \
Group Policies on a Samba client."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "samba-gpupdate-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "32163f6736ce6da495857d7aefba0bd66dd0149fdd19d9060e3c0344f988e7d5e64fb2d0fd2043a65cbb7f55df4db927e3656805cf3ae2449aa69ce641537845"

RPROVIDES:${PN} += "samba-gpupdate"

RDEPENDS:${PN} += "/usr/bin/python3 \
cepces \
certmonger \
samba-ldb-ldap \
samba-python3 \
sscep"

inherit rpm
