SUMMARY = "Samba Group Policy"
DESCRIPTION = "The samba-gpupdate package provides the samba-gpupdate tool for applying \
Group Policies on a Samba client."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "samba-gpupdate-4.18.3+git.303.c08b73d523c-1.2.aarch64.rpm"
RPM_HASH = "0ad2a538127369da06e897479117b12b967e07e60798ad70e4bed7da32e83ee6768c182abb9a3b15d550b8c5ee997c763ac7cf7024141750ad9296d51af6cafd"

RPROVIDES:${PN} += "samba-gpupdate"

RDEPENDS:${PN} += "/usr/bin/python3 \
cepces \
certmonger \
samba-ldb-ldap \
samba-python3 \
sscep"

inherit rpm
