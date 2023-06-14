SUMMARY = "PAM module for calling snapper"
DESCRIPTION = "A PAM module for calling snapper during user login and logout."
LICENSE = "GPL-2.0-only"

PV = "0.10.4"

RPM_NAME = "pam_snapper-0.10.4-13.2.aarch64.rpm"
RPM_HASH = "75c25d8288f2ce49d78cba8aa2c7405ec823bdba4ffbbc4e9ac0872295f87a84ee0b3022892dc7a5fd67ce18afc0c30d3ac3518f14b117ee793cc71a05a148ba"

RPROVIDES:${PN} += "pam-snapper"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libpam.so.0 \
pam \
snapper"

inherit rpm
