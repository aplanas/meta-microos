SUMMARY = "Iosevka in quasi-proportional slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Etoile typeface (quasi-proportional, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-etoile-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "76ce4374df17e72b05e3d6892b67d7799359d725711713804ac0dd327e76cf29fce3be4f6d9b079d3e7453779709c365d605bbf6bd8bdfe0f4bf34ce7330e66d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-etoile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
