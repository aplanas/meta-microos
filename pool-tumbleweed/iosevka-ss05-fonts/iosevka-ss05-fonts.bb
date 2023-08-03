SUMMARY = "Iosevka in monospace, Fira Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS05 typeface (monospace, Fira Mono style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss05-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "0ec228d8a324112bd0ab2b77f7a80a17f9ffe082d5335f6b856a7b31b458e87a4da200c9f3d7eb9ab45b72f11f3774fae3d7da477e20eb0ca534afaec35ab149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss05-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
