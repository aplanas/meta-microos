SUMMARY = "PAM module for calling snapper"
DESCRIPTION = "A PAM module for calling snapper during user login and logout."
LICENSE = "GPL-2.0-only"

PV = "0.10.5"

RPM_NAME = "pam_snapper-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "8391e9d0fb979c227394df17a9d94bc9b81961294a6c81e6717db1a68747746c6d87e25236db594f66b6939ee8059ccbd57488be268396b91d945c7ebe59d3c4"

RPROVIDES:${PN} += "pam-snapper"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libpam.so.0 \
pam \
snapper"

inherit rpm
