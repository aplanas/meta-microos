SUMMARY = "PAM module for calling snapper"
DESCRIPTION = "A PAM module for calling snapper during user login and logout."
LICENSE = "GPL-2.0-only"

PV = "0.10.5"

RPM_NAME = "pam_snapper-0.10.5-2.1.aarch64.rpm"
RPM_HASH = "cfa3d59664676fc20d757cf393dcccfc4156b05f4c0ee78e59ad7e4958bdd3a437f004dcb8bdbec7d1124e2b4a0c6f20e945b0387215ee49e2ef579f91ac8b9c"

RPROVIDES:${PN} += "pam-snapper"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libpam.so.0 \
pam \
snapper"

inherit rpm
