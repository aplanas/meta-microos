SUMMARY = "Iosevka in monospace, IBM Plex Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS15 typeface (monospace, IBM Plex Mono \
style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss15-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "f48dd2c76539c032511a335ff25c9270c4afacd32d7cffa9d1516632f75df0002f3710afbc1c6f70979ccd2e04d0f74d16db559653cfe7ce94bd19ad71140912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss15-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
