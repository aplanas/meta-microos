SUMMARY = "Iosevka in monospace, Input Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS18 typeface (monospace, Input Mono style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss18-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "1ad0a591b38dd1a8a3139e076f203942a4d280bfa95e1da14c4ac7b524d41b54b072683402a65e32909db4e34cc250d92871a811e9a5b4717ac74ccf89bd1e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss18-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
