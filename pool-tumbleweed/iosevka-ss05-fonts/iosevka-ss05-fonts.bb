SUMMARY = "Iosevka in monospace, Fira Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS05 typeface (monospace, Fira Mono style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss05-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "57f0265f524d39b5b298bb05b321b5a9395386f071351c2e166506dd77a2ce27f40b8e3d985009c6fd7dbf9b14eb21adabb98395cd69f23a38594764c86ed3ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss05-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
