SUMMARY = "A PAM module for roaming home directories"
DESCRIPTION = "This is a PAM module to provide roaming home directories for a user \
session. The authentication module verifies the identity of a user and \
triggers a synchronization with the server on the first login and the \
last logout."
LICENSE = "GPL-2.0-or-later"

PV = "0.43.0"

RPM_NAME = "pam_csync-0.43.0-2.3.aarch64.rpm"
RPM_HASH = "71bc760cb119397ad9a9f970b450fe9ffba2ae1b434188580bccf25b453e68031a74feca97cddf56fc4332d21fdcba56ad007506745ef09edf89520e2770617a"

RPROVIDES:${PN} += "config-pam-csync \
pam-csync"

RDEPENDS:${PN} += "libc.so.6 \
libcsync.so.0 \
libiniparser.so.1 \
libpam.so.0"

inherit rpm
