SUMMARY = "Iosevka in monospace, X Windows Fixed style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS11 typeface (monospace, X Windows Fixed \
style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss11-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "f908540891c1616f24d87fc6aa35afd013e581a8ce7ddd2a1028c34dfce08f2fe27a1899f94a56597da90b09eeae868adef55a27f3ac83a6bc88b3ed1b0ebc82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss11-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
