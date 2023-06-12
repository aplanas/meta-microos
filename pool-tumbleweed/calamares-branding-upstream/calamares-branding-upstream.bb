SUMMARY = "Branding for calamares"
DESCRIPTION = "This package provides configuration files and 'look and feel' for \
Calamares installer. 'Look and feel' files are simplified upstream files. \
Meanwhile configuration files adopted to work with openSUSE and SUSE \
based custom appliances."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.36"

RPM_NAME = "calamares-branding-upstream-3.2.36-1.20.noarch.rpm"
RPM_HASH = "8a0a1a59bb386087306ce9af3ef18ee9c88552ed13a5090b0e32b5304cbe155481ec3181f379777371d353de63afcd8b3f394da0c6277fb694c6ee02c66c3360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calamares-branding \
calamares-branding-upstream"
RDEPENDS:${PN} += "qt5qmlimport(QtQuick.2)"

inherit rpm
