SUMMARY = "Iosevka in monospace, PT Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS16 typeface (monospace, PT Mono style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss16-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "d9500f90cea610702545b2fe0ece8263537a59ac1698d72f460a2c0033c76203150decb1c39bc0eed81e2f58f856387844e3f5b2f6e6bbb9fcaf315e7f4e191e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss16-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
