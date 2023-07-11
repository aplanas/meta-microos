SUMMARY = "The newrole application for RBAC/MLS"
DESCRIPTION = "RBAC/MLS policy machines require newrole as a way of changing the role \
or level of a logged-in user."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "policycoreutils-newrole-3.5-4.1.aarch64.rpm"
RPM_HASH = "61ab0c189e3b7946709dc1dbc449a9e7de08338b0d93b2728eec01e95bbdccc54c5038910a331f70230e920d6f45d4c251cb8cec5f96565204f08dc4a837f662"

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
