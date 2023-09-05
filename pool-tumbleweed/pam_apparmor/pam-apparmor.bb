SUMMARY = "PAM module for AppArmor change_hat"
DESCRIPTION = "The pam_apparmor module provides the means for any PAM applications \
that call pam_open_session() to automatically perform an AppArmor \
change_hat operation in order to switch to a user-specific security \
policy."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "pam_apparmor-3.1.6-4.1.aarch64.rpm"
RPM_HASH = "86f388cc41781f409b773a13ad7b100eb06b25402bd576bca6d1b5d3ee73041a7e995fa428acae1a5824e0ad2c5a9ca3f943dd41816e0a4a654874f13875b147"

RPROVIDES:${PN} += "pam-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
libapparmor.so.1 \
libc.so.6 \
libpam.so.0 \
pam \
pam-config"

inherit rpm
