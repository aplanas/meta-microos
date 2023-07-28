SUMMARY = "Iosevka in monospace, IBM Plex Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS15 typeface (monospace, IBM Plex Mono \
style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss15-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "f9c3844e9b2bcc28a9006f4b9b055c8654335fef6b418b161a0a415bb1dbb990cdbf30e7fd64f103aa99f197534f9fd9b81ccd604dd5d4a3f6772ba2e2b2f2fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss15-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
