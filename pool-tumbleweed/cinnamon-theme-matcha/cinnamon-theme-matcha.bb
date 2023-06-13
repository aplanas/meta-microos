SUMMARY = "Matcha Cinnamon themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the cinnamon themes."
LICENSE = "GPL-3.0-only"

PV = "20221115"

RPM_NAME = "cinnamon-theme-matcha-20221115-1.1.noarch.rpm"
RPM_HASH = "ebaa4430f5b84a46650c93815a11e6a60a1ca36cb0e2382fcaa9e720039e0cae900e27f98e4339dada8808e86a7562697b4f0316669b6bdbd514fc17705294bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-theme-matcha"

RDEPENDS:${PN} += "cinnamon \
metatheme-matcha-common"

inherit rpm
