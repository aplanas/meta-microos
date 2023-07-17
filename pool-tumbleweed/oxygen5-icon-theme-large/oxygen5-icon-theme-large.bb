SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the large (128x128 and larger) non-scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "oxygen5-icon-theme-large-5.108.0-1.1.noarch.rpm"
RPM_HASH = "aa847f40b779065034d3f24a01c99b90a06d13023af4d8ee120e5e12cabdbb402ff04a271f1b31c4438cb6ef8eea3d0f4e01957b850cab1be059faafa76f62ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme-large \
oxygen5-icon-theme-large"

RDEPENDS:${PN} += "oxygen5-icon-theme"

inherit rpm
