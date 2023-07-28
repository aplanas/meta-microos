SUMMARY = "Iosevka in monospace, Input Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS18 typeface (monospace, Input Mono style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss18-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "9011f777ea64236478776f42159ccf4bc4df6e3ad5fcdb13395e788dca3bdbcdcd3ab4a9a8ae9a163cd9f613f5b47b85c28cbcccacc40ca02cf332e9efe8091e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss18-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
