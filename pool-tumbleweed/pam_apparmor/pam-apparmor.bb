SUMMARY = "PAM module for AppArmor change_hat"
DESCRIPTION = "The pam_apparmor module provides the means for any PAM applications \
that call pam_open_session() to automatically perform an AppArmor \
change_hat operation in order to switch to a user-specific security \
policy."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "pam_apparmor-3.1.4-1.1.aarch64.rpm"
RPM_HASH = "9e08bd715c4f0e9ae1977c4de2944ca61a7fb0064f9680956b7f5ce0d9cbeeb8111db5d8e41104fe893a66bd8f326672ff9cd750775d146de7fff530afe0abf8"

RPROVIDES:${PN} += "pam-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
libapparmor.so.1 \
libc.so.6 \
libpam.so.0 \
pam \
pam-config"

inherit rpm
