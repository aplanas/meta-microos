SUMMARY = "FDO Icon theme to go with Dark Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the Dark Enlightenment \
theme"
LICENSE = "GPL-3.0-only"

PV = "20220216.1.26"

RPM_NAME = "openSUSE-e-X-Dark-Icons-20220216.1.26-1.10.noarch.rpm"
RPM_HASH = "1e797920cfc0666f1f4cd4de4fa95582fb33e563c6092a0a8b8ef122f4ab94039a8a9b100ed6fca021c588488a3f76465e07e1bf22998bb125c9645cb72db236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Dark-Icons"

RDEPENDS:${PN} += ""

inherit rpm
