SUMMARY = "The newrole application for RBAC/MLS"
DESCRIPTION = "RBAC/MLS policy machines require newrole as a way of changing the role \
or level of a logged-in user."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "policycoreutils-newrole-3.5-2.1.aarch64.rpm"
RPM_HASH = "2ff1d18b5a4fc7bbc1a80c47a0fc29e7d34516707bc71b0acd930854656f3d8d40e6749cd765cb80d227869501871d1ea3f32090fca864ad30cdddb5211e394e"

RPROVIDES:${PN} += "policycoreutils-newrole"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libpam-misc.so.0 \
libpam.so.0 \
libselinux.so.1 \
permissions \
policycoreutils"

inherit rpm
