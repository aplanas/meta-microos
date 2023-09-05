SUMMARY = "Iosevka in monospace, Lucida style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS13 typeface (monospace, Lucida style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss13-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "d474ab9cc447727db627d0112f122f90dc8905bbd8bdc1b09fe8eec3011cefd3203835934ec0abdb432c01436bd5de8fbb315c12d9b90b68854e293fe66dab38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss13-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
