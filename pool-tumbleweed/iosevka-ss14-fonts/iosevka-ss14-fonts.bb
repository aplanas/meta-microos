SUMMARY = "Iosevka in monospace, JetBrains Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS14 typeface (monospace, JetBrains Mono \
style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss14-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "c0c376e11a632ed6003d0f0e524d78eb9380fde86809bbbabc94aee74550c2abf9350b9c01a1f7b94f85db95608041cca7949b0f821714d9a01cda9a90b9f6bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss14-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
