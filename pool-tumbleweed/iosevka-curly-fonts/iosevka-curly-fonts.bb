SUMMARY = "Iosevka in monospace curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly typeface (curly style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-curly-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "414659201fca4d57154c4a1aa45e2fa6967325cccf0a2be26eab743d30239f3d40835fcdcb13d9dfc3b3b536afce8a839f97fabb1a7f1238dff1711fdf3470ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
