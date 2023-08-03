SUMMARY = "Iosevka in monospace, Input Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS18 typeface (monospace, Input Mono style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss18-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "572f6a5e3bd96a56555d4f07d2d44d464d62969ec51ba66f46d1ed356abafef4045607cec9d3e44005ca1d3d3bdf129301ca3fc3eeabca4bae742381dd43ce4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss18-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
