SUMMARY = "Iosevka in monospace, Source Code Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS09 typeface (monospace, Source Code Pro \
style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss09-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "be1bc4bdffa7098fd77badca834b3c4b095aaf1ed6b89ff73992c212e803e97454e7f77d33677bc58d9b80088a967d403432069c3244427743488343b84b6e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss09-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
