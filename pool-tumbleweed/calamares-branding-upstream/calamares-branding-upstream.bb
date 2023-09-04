SUMMARY = "Branding for calamares"
DESCRIPTION = "This package provides configuration files and 'look and feel' for \
Calamares installer. 'Look and feel' files are simplified upstream files. \
Meanwhile configuration files adopted to work with openSUSE and SUSE \
based custom appliances."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.62"

RPM_NAME = "calamares-branding-upstream-3.2.62-1.2.noarch.rpm"
RPM_HASH = "874c3b56e8645a0b4b07c60797e271ff5bef54b50e321d4265d36ea6e84bf9fcacdaed67ab941e40f5917195789677faf6aa816e305eb8bccaa78aa18b2a591e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calamares-branding \
calamares-branding-upstream"

RDEPENDS:${PN} += "qt5qmlimport-QtQuick.2"

inherit rpm
