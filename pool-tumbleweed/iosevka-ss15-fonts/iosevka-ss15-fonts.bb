SUMMARY = "Iosevka in monospace, IBM Plex Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS15 typeface (monospace, IBM Plex Mono \
style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss15-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "bbd6cee2bc9ee523a922ae3e61e4a502af8a501834bc45187181e67676076df7ba02d3da785db807e20e84d7077a33d2aa471a95032269b98872e7a624031659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss15-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
