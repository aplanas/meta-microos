SUMMARY = "Iosevka in quasi-proportional slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Etoile typeface (quasi-proportional, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-etoile-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "9a59f649166d77b5d122952313a2b242398375fc00b657396aa235ea606160c6f6161f988327dc194a3866bf17b748bea4ff38a1d81d3d454148476f9f3a5517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-etoile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
