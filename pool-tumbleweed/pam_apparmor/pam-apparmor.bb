SUMMARY = "PAM module for AppArmor change_hat"
DESCRIPTION = "The pam_apparmor module provides the means for any PAM applications \
that call pam_open_session() to automatically perform an AppArmor \
change_hat operation in order to switch to a user-specific security \
policy."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "pam_apparmor-3.1.6-1.1.aarch64.rpm"
RPM_HASH = "cc86ffeb5ada45c9a3cc0958e511ba2dd8ac543b6c23a5e83260621b1f6cea637bde1420b49fc55144584a01421065324825bd3bd68500c0306d690fdd64b2ff"

RPROVIDES:${PN} += "pam-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
libapparmor.so.1 \
libc.so.6 \
libpam.so.0 \
pam \
pam-config"

inherit rpm
