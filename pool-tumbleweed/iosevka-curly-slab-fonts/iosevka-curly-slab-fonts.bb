SUMMARY = "Iosevka in monospace slab-serif curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly Slab typeface (curly style, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-curly-slab-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "43b0fdf3a4cb1b3440cc3cccac3a0b0d078a46d02dd6d1e61b34eabe9e8f1c02219d2cce828a8d31a6dff4310c10e6529b3c8c8a736c415e93c3fe62567ea925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-slab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
