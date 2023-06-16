SUMMARY = "Sonar Icon Theme"
DESCRIPTION = "Sonar icon theme based on the upcoming GNOME icon theme."
LICENSE = "GPL-2.0-or-later"

PV = "11.3.1"

RPM_NAME = "sonar-icon-theme-11.3.1-30.17.noarch.rpm"
RPM_HASH = "48ac1ed7f369b3ae3f56879d5e1b746f712cba798dc5508d1e4cb286e75fae583f538df0e2864f4b4da7e4a311cae93ca685c6e4c5bd8442cfa39b73c1a397e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icon-theme-sonar \
sonar-icon-theme"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme"

inherit rpm
