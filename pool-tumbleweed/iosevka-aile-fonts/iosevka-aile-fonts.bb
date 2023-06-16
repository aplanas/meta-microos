SUMMARY = "Iosevka in quasi-proportional sans-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Aile typeface (quasi-proportional, \
sans-serif)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-aile-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "fac98b7c24e9a7bdbc8384512b8a634d96ed3cff9d44bebab32574ba162d669f2eb0186be96c3971a55d0d3096d1c1e72dfd0bbf70ca077ec171ab1967d2ed24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-aile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
