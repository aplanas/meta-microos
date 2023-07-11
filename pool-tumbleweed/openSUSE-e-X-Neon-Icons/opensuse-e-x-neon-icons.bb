SUMMARY = "FDO Icon theme to go with openSUSE Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the openSUSE Enlightenment \
Neon theme"
LICENSE = "GPL-3.0-only"

PV = "20220219.1.26"

RPM_NAME = "openSUSE-e-X-Neon-Icons-20220219.1.26-1.12.noarch.rpm"
RPM_HASH = "d1649c873282c930fc4c5aecec85485364644657d1bf9c9f425a4b706bf6d721261d174c2156fac1b3d1d2de77b943e5605e0c376fdff5e45d0982cdc2a29b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Neon-Icons"

RDEPENDS:${PN} += ""

inherit rpm
