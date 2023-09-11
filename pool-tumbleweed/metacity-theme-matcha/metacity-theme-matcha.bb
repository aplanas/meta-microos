SUMMARY = "Matcha Metacity themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the metacity themes."
LICENSE = "GPL-3.0-only"

PV = "20230403"

RPM_NAME = "metacity-theme-matcha-20230403-1.1.noarch.rpm"
RPM_HASH = "e2b4efdfcf4995ee0afa625f42186c4868ad6d67b8a9aed61fdd23e22ac47b482f3d3f9d601e86d39a7fef7ce1f95de4f8befd6e9d0a243298fe75c488964c38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metacity-theme-matcha"

RDEPENDS:${PN} += "metacity \
metatheme-matcha-common"

inherit rpm
