SUMMARY = "Iosevka in monospace, Liberation Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS06 typeface (monospace, Liberation Mono \
style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss06-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "449deb9498cf8d579a59f78ec9c28ea03a674baaca5756814176a5409c6df1d89541261bb371962a6fdf8cb5519c1b544e907349ae91b3a94b4905f69ddb7b26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss06-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
