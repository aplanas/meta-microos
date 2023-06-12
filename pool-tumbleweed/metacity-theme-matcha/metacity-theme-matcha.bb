SUMMARY = "Matcha Metacity themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the metacity themes."
LICENSE = "GPL-3.0-only"

PV = "20221115"

RPM_NAME = "metacity-theme-matcha-20221115-1.1.noarch.rpm"
RPM_HASH = "f4c986e2bd76a1d528548bbb3db5dc073b5800c5389f55e60883d1b1297a3a3e1725c5bb591a6fdd7cdfb08a509a627ba24cce7f4bf4996789014230779fe7e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metacity-theme-matcha"
RDEPENDS:${PN} += "metacity \
metatheme-matcha-common"

inherit rpm
