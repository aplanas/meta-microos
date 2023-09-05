SUMMARY = "Iosevka in monospace, Recursive Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS17 typeface (monospace, Recursive Mono \
style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss17-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "2fe682d437c08830b0c91f33e069f30786863dcd83be0da6ea5c81c4290679e41fbd68c0e2a6eb00f3ed892713dbcee0b74213701aff093e964f2668062c352c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss17-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
