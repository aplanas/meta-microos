SUMMARY = "Arabic Kacst Fonts"
DESCRIPTION = "TrueType families developed by Kacst institution."
LICENSE = "GPL-2.0-only"

PV = "2.01"

RPM_NAME = "arabic-kacst-fonts-2.01-18.15.noarch.rpm"
RPM_HASH = "3fb072b948cd38a2377e8faa6cb213bbb11730c3936e86d7aaf8f213ae9206a443406d347574dea3bb6035207706fbafb5721c5571a058752ddc70a579397c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-kacst-fonts \
locale(ar)"

RDEPENDS:${PN} += ""

inherit rpm
