SUMMARY = "FDO Icon theme to go with openSUSE Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the openSUSE Enlightenment \
Neon theme"
LICENSE = "GPL-3.0-only"

PV = "20220219.1.26"

RPM_NAME = "openSUSE-e-X-Neon-Icons-20220219.1.26-1.10.noarch.rpm"
RPM_HASH = "e7d3d3a5f89bb879936502c91e67bebe7612c881c9389070cb4264babf497a0b2955718b21e15e548c02f6e20278c78554b155ff6af1245910d8e04a3e05b4e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Neon-Icons"

RDEPENDS:${PN} += ""

inherit rpm
