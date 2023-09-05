SUMMARY = "Iosevka in monospace slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Slab typeface (monospace, slab-serif)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-slab-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "41fae311ad49aaf7c944309e26dd817456dd25acab159b7f1fc57eb5ec648f2b89670f8a49901d1a1db54965728dcc4d5e3962b976fa791e1a2c274e5cd5aab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-slab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
