SUMMARY = "Iosevka in monospace slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Slab typeface (monospace, slab-serif)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-slab-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "28316df0d457588fb483bddd5fdf7d3414bab5c1923e91c8c10cd6d1bfac5bdba4e2bcc515ae429c6341369b395eafbbb821b6c07f95bc89728d34851b99eed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-slab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
