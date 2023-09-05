SUMMARY = "Iosevka in quasi-proportional slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Etoile typeface (quasi-proportional, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-etoile-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "99b3971a1bfb544fd0762bebcadfbf0bf2dedd2a7a9d684ae485ca91e35df34c43913a7b039059feae5126ebfdd0760fc2331d735c519678fc0440adb93a90bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-etoile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
