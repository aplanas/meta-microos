SUMMARY = "Iosevka in monospace, X Windows Fixed style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS11 typeface (monospace, X Windows Fixed \
style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss11-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "31b96c377380c90d758476d018b6eb93fcbf2dcd1881a649b264c78d95322abc67c886857d6ddae4ccd7a4291cb0156af384fe6531ec6cca9bbf9a609bf3b0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss11-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
