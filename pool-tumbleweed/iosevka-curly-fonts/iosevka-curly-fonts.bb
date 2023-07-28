SUMMARY = "Iosevka in monospace curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly typeface (curly style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-curly-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "bc0dfac8c9fd2d64e5e4ec36df281337e8d8dc60f5f26172221da8cc861ec0366b6aac349d457ec5e7ffb9cc090babe27199e2acc367e2209c7440af550ca001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
