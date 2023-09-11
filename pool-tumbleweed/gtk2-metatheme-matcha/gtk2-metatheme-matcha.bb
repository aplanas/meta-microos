SUMMARY = "Matcha GTK+2 themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the GTK2+ themes."
LICENSE = "GPL-3.0-only"

PV = "20230403"

RPM_NAME = "gtk2-metatheme-matcha-20230403-1.1.noarch.rpm"
RPM_HASH = "64a73d53c00264ec858b30ff6827e05eecff54dcc2f36b76bfb3cab9fb88252ec12f55d307d46fecc5fdb099fdca8aee15cabafc856861db5b3359c2f4401018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-matcha"

RDEPENDS:${PN} += "gtk2 \
gtk2-engine-murrine \
metatheme-matcha-common"

inherit rpm
