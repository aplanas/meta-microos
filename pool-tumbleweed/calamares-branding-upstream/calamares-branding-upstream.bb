SUMMARY = "Branding for calamares"
DESCRIPTION = "This package provides configuration files and 'look and feel' for \
Calamares installer. 'Look and feel' files are simplified upstream files. \
Meanwhile configuration files adopted to work with openSUSE and SUSE \
based custom appliances."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.62"

RPM_NAME = "calamares-branding-upstream-3.2.62-1.1.noarch.rpm"
RPM_HASH = "08a34a90eff35c514a0ae1a149ee029f39e3a647788bbdc686628efd0397fb96d2bc7c01e6225a112233d1b4aed701a4dae9cca93a33c48b7d91b9f754213d3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calamares-branding \
calamares-branding-upstream"

RDEPENDS:${PN} += "qt5qmlimport-QtQuick.2"

inherit rpm
