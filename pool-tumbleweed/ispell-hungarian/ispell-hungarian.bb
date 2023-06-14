SUMMARY = "Hungarian Ispell Dictionary"
DESCRIPTION = "This package contains the hungarian ispell dictionary."
LICENSE = "GPL-2.0+ | LGPL-2.1+ | MPL-1.1"

PV = "1.6.1"

RPM_NAME = "ispell-hungarian-1.6.1-1.14.noarch.rpm"
RPM_HASH = "4df1f2eeb00f63a51d4d7355d1d0e37e49f0d654d3372bae46b71d29161ff28311799628c7926e0f963412c155d6990bcaee96b6a41d3814824a762718d9d225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ispell-dictionary \
ispell-hungarian \
locale-ispell-hu"

RDEPENDS:${PN} += ""

inherit rpm
