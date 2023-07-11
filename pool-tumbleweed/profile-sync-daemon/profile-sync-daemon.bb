SUMMARY = "Symlinks and syncs browser profile dirs to RAM thus reducing HDD/SDD calls"
DESCRIPTION = "Profile-sync-daemon (psd) is a tiny pseudo-daemon designed to manage your \
browser's profile in tmpfs and to periodically sync it back to your physical \
disc (HDD/SSD). This is accomplished via a symlinking step and an innovative \
use of rsync to maintain back-up and synchronization between the two. One of \
the major design goals of psd is a completely transparent user experience."
LICENSE = "MIT"

PV = "6.48"

RPM_NAME = "profile-sync-daemon-6.48-1.3.noarch.rpm"
RPM_HASH = "6c02db8b1eb97217166eb3a47b31becfa51204e463cabead369931d2a60a034dda9b4af42186fe40aa04de740ecc7eb61e141dfacabb5fbf7467a1ad29f1a527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "profile-sync-daemon"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
rsync"

inherit rpm
