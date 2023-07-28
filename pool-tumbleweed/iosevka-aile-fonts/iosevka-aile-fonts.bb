SUMMARY = "Iosevka in quasi-proportional sans-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Aile typeface (quasi-proportional, \
sans-serif)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-aile-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "43c5ddb4ceda5781e0e69bce7bd0a967a270bc43d3a403ab7aeceda0bfb1105775dafe9e262234390ffff48a1f419d94948bf3922c4c1fdf7447eca14e41ee57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-aile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
