SUMMARY = "Iosevka in monospace, Monaco style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS07 typeface (monospace, Monaco style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss07-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "419769d01f8a18927488dabbf08296c11195cdba9ad812053373e487db198a87b5e4dce2ef4ad6297ebb7edbb61930d5e717507fe62b94491a7d49bc92a6e704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss07-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
