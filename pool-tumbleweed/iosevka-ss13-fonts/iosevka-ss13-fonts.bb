SUMMARY = "Iosevka in monospace, Lucida style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS13 typeface (monospace, Lucida style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss13-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "d51c31474b3d7dee0d1d442f87f8ce5e6ca7560f2e716e40ff673170d7b27acefd9839a8a6e1b27ee051fa004e3367ddeb8bbad523a999411db74acc125ed028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss13-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
