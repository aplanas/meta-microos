SUMMARY = "FDO Icon theme to go with Dark Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the Dark Enlightenment \
theme"
LICENSE = "GPL-3.0-only"

PV = "20220216.1.26"

RPM_NAME = "openSUSE-e-X-Dark-Icons-20220216.1.26-1.12.noarch.rpm"
RPM_HASH = "613725313c9c81d19f326b72b4e047b500f3fa5e55431112e27a385c3ea28b9a462401c1264a8a4bca1b85f1f89266a3713f1af39073929cc83aac4076569d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Dark-Icons"

RDEPENDS:${PN} += ""

inherit rpm
