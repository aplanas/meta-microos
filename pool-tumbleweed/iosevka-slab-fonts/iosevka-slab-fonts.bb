SUMMARY = "Iosevka in monospace slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Slab typeface (monospace, slab-serif)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-slab-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "aeb7b5f398ed0531ef9dcdc4ea83854e7a12c8ece8cfad047e8251783af031d9d27239eaa36e6deeea9260d445af7016dd86951ec69ede4d85d4406ce141b521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-slab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
