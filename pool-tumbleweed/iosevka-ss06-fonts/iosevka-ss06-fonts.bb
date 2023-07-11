SUMMARY = "Iosevka in monospace, Liberation Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS06 typeface (monospace, Liberation Mono \
style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss06-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "188ef3ff92bf96d236bc8ddbc2b1a03f931f9035475c737b06871d9a40970a2f3a76090a0f4d5bae2a03d024431b686a81dcdf1f930e0dc7cf326ef6e283d2b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss06-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
