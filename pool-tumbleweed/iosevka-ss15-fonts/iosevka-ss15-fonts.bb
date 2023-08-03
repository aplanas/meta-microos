SUMMARY = "Iosevka in monospace, IBM Plex Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS15 typeface (monospace, IBM Plex Mono \
style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss15-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "4672f04e4e9d9881f39a4c1bf79daa879c1d72690c4a9c38045d8f9dd8acca9dfb23f393890ae649f597d3377dcc5ca823be75dde280047e9fb0fa0fde4ae31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss15-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
