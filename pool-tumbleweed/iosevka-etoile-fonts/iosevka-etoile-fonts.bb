SUMMARY = "Iosevka in quasi-proportional slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Etoile typeface (quasi-proportional, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-etoile-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "e0fcd7e40268d2efb2bf8e8211e2ca455fdf048b089c930ef10d6824e691a37784b1496720d2fa0bdb08b7a347f064b4d3edc62d551ca76f73eb15d6e33beeae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-etoile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
