SUMMARY = "PAM module for AppArmor change_hat"
DESCRIPTION = "The pam_apparmor module provides the means for any PAM applications \
that call pam_open_session() to automatically perform an AppArmor \
change_hat operation in order to switch to a user-specific security \
policy."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "pam_apparmor-3.1.6-2.2.aarch64.rpm"
RPM_HASH = "e797c423aabafeec9d8b4b5531e99338afeb34050b877ee4e02c0c2ed085fc1eb09eb4e526e802954330d16e3959b49370bc9808e430bc829aa1cf8ed75d7cc2"

RPROVIDES:${PN} += "pam-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
libapparmor.so.1 \
libc.so.6 \
libpam.so.0 \
pam \
pam-config"

inherit rpm
