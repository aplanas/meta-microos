SUMMARY = "MATE window manager themes"
DESCRIPTION = "Marco is a small window manager, using GTK+ to do everything. It is \
developed mainly for the MATE Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.2"

RPM_NAME = "marco-themes-1.26.2-1.1.noarch.rpm"
RPM_HASH = "4a3716748807b71a545234133b52cd7a42d6e5cea1838ca076e151833e098ca9a240b70e5f3856c7af84a11559504290840dc9414c82b02645849ca9b54d9985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marco-themes \
mate-window-manager-themes"
RDEPENDS:${PN} += ""

inherit rpm
