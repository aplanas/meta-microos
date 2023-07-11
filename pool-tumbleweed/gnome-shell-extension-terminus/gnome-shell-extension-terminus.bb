SUMMARY = "Show Terminus Quake Mode"
DESCRIPTION = "Allows to show the Quake-like terminal from Terminus by pressing the \
defined hotkey."
LICENSE = "GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "gnome-shell-extension-terminus-2.3.1-1.2.noarch.rpm"
RPM_HASH = "203ae8036b02df15440ba55187307734830b0b0850d9d326095f9f123947d640af44d1288544e66b0c3f235aaec2425bacc15a70a7a1dcd3da1a357eee792093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-terminus"

RDEPENDS:${PN} += "gnome-shell \
terminus"

inherit rpm
