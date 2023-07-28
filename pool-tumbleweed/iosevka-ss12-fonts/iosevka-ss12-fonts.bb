SUMMARY = "Iosevka in monospace, Ubuntu Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS12 typeface (monospace, Ubuntu Mono style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss12-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "9105fdf75ff123d2ea56b97077c9ba461f54cea029ac7ffb2e28b54d393b6cdeb4f4a8aec3aef6e70b06228927f83467ecd16662191bd56ba622889c33256666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss12-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
