SUMMARY = "PAM module for AppArmor change_hat"
DESCRIPTION = "The pam_apparmor module provides the means for any PAM applications \
that call pam_open_session() to automatically perform an AppArmor \
change_hat operation in order to switch to a user-specific security \
policy."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "pam_apparmor-3.1.6-2.1.aarch64.rpm"
RPM_HASH = "8ad147f78766b8cc48bef698d62decd2ab0da8792590aa75561cd6dc3b2d9c868302050bc6652601c674bc6387aff4294451814b3ca8257bda32323ab4a0e1fe"

RPROVIDES:${PN} += "pam-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
libapparmor.so.1 \
libc.so.6 \
libpam.so.0 \
pam \
pam-config"

inherit rpm
