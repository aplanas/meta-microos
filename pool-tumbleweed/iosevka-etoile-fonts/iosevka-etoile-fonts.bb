SUMMARY = "Iosevka in quasi-proportional slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Etoile typeface (quasi-proportional, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-etoile-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "3ab46a2a194dfb5a6a9734bd0d67b157c0f5fef8fee0f20ae041534ef4e30dce1eb161dabe5d3a96c7b3fc6f33991005fd383f7972651f6a8f078ae9dd0d3c7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-etoile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
