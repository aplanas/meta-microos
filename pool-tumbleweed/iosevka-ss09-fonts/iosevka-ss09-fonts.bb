SUMMARY = "Iosevka in monospace, Source Code Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS09 typeface (monospace, Source Code Pro \
style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss09-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "49d860ec3b873e9037418c465f16a7a6dde77088a02aecde9d1676ce532fde6f5c772392b1ac04df8b41b21290670706af96aff51f139d41d98a7d43184f0c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss09-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
