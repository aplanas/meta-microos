SUMMARY = "Iosevka in monospace, PT Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS16 typeface (monospace, PT Mono style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss16-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "ddf00ad78b850b2abc43dbdfe161752437a5a49ce6265ede5e88b3b966e2a13d4faa9fd76d1b88b85e710c608697c823f98be707fb37b08ef027e20493b901ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss16-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
