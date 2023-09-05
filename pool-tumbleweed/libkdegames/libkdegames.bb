SUMMARY = "General Data for KDE Games"
DESCRIPTION = "This package contains data which is required by the KDE games library."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkdegames-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f4d65b1eaea387e81894d6a172741f7885b5047265804194f7abde4df88faef680f9d2ee62ab3baa4f3e2a4c2c74625345db64f975099f2b2f5fb954b45f14e8"

RPROVIDES:${PN} += "libkdegames \
libkdegames-kf5"

RDEPENDS:${PN} += ""

inherit rpm
