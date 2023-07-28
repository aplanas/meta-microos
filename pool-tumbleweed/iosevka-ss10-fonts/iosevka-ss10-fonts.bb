SUMMARY = "Iosevka in monospace, Envy Code R style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS10 typeface (monospace, Envy Code R style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss10-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "f9c9380c4f38e8d789df05d2c54f3987662a5a508262a3b89ba922d3f1b5bb14f99cd3d0fe141b32a96aa95f106709b9adf087fccb2e1cfadf88a8ad501669f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss10-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
