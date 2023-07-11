SUMMARY = "Iosevka in monospace slab-serif curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly Slab typeface (curly style, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-curly-slab-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "211db4899b5ad10bee82e436944b69651a8d012cc3320060056de42be991581cb4b9a6d17d29b4e50f6668368dc5ef2c1ceff1798b32ecfb1da1afc98cd87196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-slab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
