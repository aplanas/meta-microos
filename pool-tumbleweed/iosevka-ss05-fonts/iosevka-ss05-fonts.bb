SUMMARY = "Iosevka in monospace, Fira Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS05 typeface (monospace, Fira Mono style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss05-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "b7c8c2420730c069ba277561116ee40dd85121dd7d22e18b204d4e1f9318787eb717366b994f9214a22b210b71a0e43c1b3d0cfa0b3cabe81def03b5267c6638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss05-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
