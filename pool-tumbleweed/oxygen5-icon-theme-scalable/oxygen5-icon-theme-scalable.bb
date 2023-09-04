SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "oxygen5-icon-theme-scalable-5.109.0-1.1.noarch.rpm"
RPM_HASH = "e61a4f72ad67b2f05f4f6a0fb57e4dcf3e566f6eec8673713074ae713ef5cfddfb2f0ba3a36fe05e05bae23304f1229b43cc332e047b77d7d3c188e6588aeb0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme-scalable \
oxygen5-icon-theme-scalable"

RDEPENDS:${PN} += "/usr/bin/bash \
oxygen5-icon-theme"

inherit rpm
