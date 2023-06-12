SUMMARY = "Iosevka in monospace, Input Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS18 typeface (monospace, Input Mono style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss18-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "1e91f5968a1b7f3c98f7f326406e52537c5802e919d9beac6c432aed438e7b558d311783d95b66cc43eb68c9824ebe08dfd39d00d41df74bab56c1a7fcdf9294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss18-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
