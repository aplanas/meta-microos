SUMMARY = "Iosevka in monospace, Envy Code R style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS10 typeface (monospace, Envy Code R style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss10-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "eeb94cfd488f023918e9d62abac4396d76a026424fb1fe7eda0662d6bb4a08a0992e324f046dc769208a71f8e6bff297d46c7e13cad0e6619ad82933526249d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss10-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
