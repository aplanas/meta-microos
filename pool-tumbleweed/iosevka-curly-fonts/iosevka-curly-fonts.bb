SUMMARY = "Iosevka in monospace curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly typeface (curly style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-curly-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "1aeac08d8b1c30c6c7a0dfa589fdec917b87e1038f3b155c7f867b10bc630c7ea703aeaad23b0e641303c50f16870cb642d081f77d6d0f0f82038c1f33a628eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
