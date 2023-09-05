SUMMARY = "Iosevka in quasi-proportional sans-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Aile typeface (quasi-proportional, \
sans-serif)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-aile-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "6658d5712b4f61706ff1dca094b0ba09ce39e4928bbeea01408940cdc04a5a8522092bf0975835bcddc1559814d102921bfc31e1fe5e630213b640fea9fc48e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-aile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
