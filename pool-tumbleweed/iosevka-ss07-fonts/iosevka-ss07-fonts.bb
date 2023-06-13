SUMMARY = "Iosevka in monospace, Monaco style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS07 typeface (monospace, Monaco style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss07-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "b983760553582bfd719e994f5565f64f0c1e78d1b1eba1004e0378bd03fc072c6dd0d5909a5b159b6b1e7dbcf3b179e9e87d72b1426b9b03b174e25d5d2b39ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss07-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
