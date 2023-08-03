SUMMARY = "Iosevka in quasi-proportional sans-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Aile typeface (quasi-proportional, \
sans-serif)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-aile-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "19ff321eb10f847eb027275933fbf96726454fb4ab82ad43c0aff6deadc9fd4b0e6253284ac4bf2377da687b5bf0908f07f49389a26086d136b41c0d9e2cd16c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-aile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
