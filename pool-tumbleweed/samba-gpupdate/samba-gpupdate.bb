SUMMARY = "Samba Group Policy"
DESCRIPTION = "The samba-gpupdate package provides the samba-gpupdate tool for applying \
Group Policies on a Samba client."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "samba-gpupdate-4.18.5+git.313.c8e274c7852-1.1.aarch64.rpm"
RPM_HASH = "f53bf9f2febcf0b1ba283497ceb7bab8727ff1e2a446e5b92429c92dbf237ce727718f5a42a791755280d7e82c268a776ca869c4d475a277e7360f0ad0531652"

RPROVIDES:${PN} += "samba-gpupdate"

RDEPENDS:${PN} += "/usr/bin/python3 \
cepces \
certmonger \
samba-ldb-ldap \
samba-python3 \
sscep"

inherit rpm
