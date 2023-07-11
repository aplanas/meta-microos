SUMMARY = "Iosevka in monospace, Input Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS18 typeface (monospace, Input Mono style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss18-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "c35528bd3d624da51f93b21ea034f2f01f45235d9e8f2b92064ded62c2543effdf9abff76617a73e6043007c97fb50a30177ed9c8dd0f1491e78ddd5ace32b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss18-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
