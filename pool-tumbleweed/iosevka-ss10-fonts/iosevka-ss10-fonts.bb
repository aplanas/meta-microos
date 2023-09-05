SUMMARY = "Iosevka in monospace, Envy Code R style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS10 typeface (monospace, Envy Code R style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss10-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "5d0c5224618a6b4701277c8621fcdd6dc79951512ef135d607a9e2f1b3249ec94398fc4bff8a16b4530e9c1c9f70bfd300a91e4b6448185d7c91a1e519a4c60f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss10-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
