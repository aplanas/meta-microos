SUMMARY = "Matcha Plank themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the Plank themes."
LICENSE = "GPL-3.0-only"

PV = "20230403"

RPM_NAME = "plank-theme-matcha-20230403-1.1.noarch.rpm"
RPM_HASH = "d17203b8f7b62c1e6a900f6f65c690e12647f17c8c7c5fb42d164bb01f87dd8905632074a61ee1770374c396f42853d08227d3b57c31c0460770fa03e83099e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plank-theme-matcha"

RDEPENDS:${PN} += "metatheme-matcha-common \
plank"

inherit rpm
