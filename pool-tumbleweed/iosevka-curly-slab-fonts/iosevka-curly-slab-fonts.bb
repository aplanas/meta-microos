SUMMARY = "Iosevka in monospace slab-serif curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly Slab typeface (curly style, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-curly-slab-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "86a2c9e12437aa4ed38a940d5488bb5b4b6a18c815f0fcddf5bdde8990fb98e31f22d3f15a2def60391fa4a09a0bf0e7779c6aa661704802d3f5846c30fc119b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-slab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
