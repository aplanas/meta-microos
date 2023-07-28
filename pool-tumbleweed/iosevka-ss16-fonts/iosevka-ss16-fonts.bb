SUMMARY = "Iosevka in monospace, PT Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS16 typeface (monospace, PT Mono style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss16-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "be5826df92e85cd860f37f09f962d0b3f80947240a58808986d913836f2793065c542141debf902fcc179b180cd896d63061bb3e80f95d3b49171e9ffd6820a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss16-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
