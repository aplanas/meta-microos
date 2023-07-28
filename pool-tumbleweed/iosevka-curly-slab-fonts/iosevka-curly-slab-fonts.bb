SUMMARY = "Iosevka in monospace slab-serif curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly Slab typeface (curly style, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-curly-slab-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "a4b0f65e9130eb2a0f6fe29b7259f8cd9f0c00b208721d90a82730e6bcd26b62e8fb55aaeb5c45a21ac5d6598c77c30e2dbfd7f2324e8aed42cb5a489f0fa2db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-slab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
