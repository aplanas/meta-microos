SUMMARY = "Iosevka in quasi-proportional sans-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Aile typeface (quasi-proportional, \
sans-serif)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-aile-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "9e1d200ec89fb4fedf67febf1619534497f765ffa09664cccc192ad6e640b1eeaa6d6e8f3685486f650dc772cbd64d55d162c801efcad6e954acf45781136388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-aile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
