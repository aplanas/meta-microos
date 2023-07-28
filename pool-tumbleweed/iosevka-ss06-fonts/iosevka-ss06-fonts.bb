SUMMARY = "Iosevka in monospace, Liberation Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS06 typeface (monospace, Liberation Mono \
style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss06-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "fe0ac48c6acdd5491c2a84ff60d0ac40ffa4c1e969cea5d0ce4e1d27afc3b5f4ca9214c3ecbd8853965731af09e19cb05aee07d5b1ea5f3782dc7cf03f15b201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss06-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
