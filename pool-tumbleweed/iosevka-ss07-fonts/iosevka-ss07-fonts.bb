SUMMARY = "Iosevka in monospace, Monaco style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS07 typeface (monospace, Monaco style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss07-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "1d40a693956c2b2510561099e1a2169a0e3f124166eaf659a859fccbd44d3b5b38de2feae8b4db603976b4d8c2934bb7dad806038ee8aef07d879fd6e350e938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss07-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
