SUMMARY = "Symlinks and syncs browser profile dirs to RAM thus reducing HDD/SDD calls"
DESCRIPTION = "Profile-sync-daemon (psd) is a tiny pseudo-daemon designed to manage your \
browser's profile in tmpfs and to periodically sync it back to your physical \
disc (HDD/SSD). This is accomplished via a symlinking step and an innovative \
use of rsync to maintain back-up and synchronization between the two. One of \
the major design goals of psd is a completely transparent user experience."
LICENSE = "MIT"

PV = "6.48"

RPM_NAME = "profile-sync-daemon-6.48-1.2.noarch.rpm"
RPM_HASH = "7e8a8ed18700f99d9324374865a8fe9c63ff325664080714e458b16202da19c160906a80bcbbcacf08653925a38a661f76259b7b9f36766f69b948bbde0aae35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "profile-sync-daemon"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
rsync"

inherit rpm
