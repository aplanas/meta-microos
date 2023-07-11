SUMMARY = "Utilities to handle user data directories"
DESCRIPTION = "xdg-user-dirs is a tool to help manage 'well known' user directories \
like the desktop folder and the music folder. It also \
handles localization (i.e. translation) of the filenames."
LICENSE = "GPL-2.0-only"

PV = "0.18"

RPM_NAME = "xdg-user-dirs-0.18-2.3.aarch64.rpm"
RPM_HASH = "e22437c8994a2532ac4222e0bf6158921123b1509a70efcc12bd42c7d42f729b98e5eea4afa377e5b717fb398c08160fef1da48fb50ca6454537f98740b7ce4b"

RPROVIDES:${PN} += "config-xdg-user-dirs \
xdg-user-dirs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
