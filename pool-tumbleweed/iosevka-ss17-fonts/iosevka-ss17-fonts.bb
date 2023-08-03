SUMMARY = "Iosevka in monospace, Recursive Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS17 typeface (monospace, Recursive Mono \
style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss17-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "aae77bb20d7cf061703a06e27d8204eb95c5016d99d121df9ac4960c0cd6d5135699a1e08cafdb90fcfc3ff501bed3a42645488afeb357c090f3ec6508a9fc5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss17-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
