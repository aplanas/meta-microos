SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 3 Support"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.7"

RPM_NAME = "gtk3-metatheme-breeze-5.27.7-1.1.noarch.rpm"
RPM_HASH = "47f8f8222b163ec1aedabfd7e09e6524fea0d773b434be22cd68c1711bd175434302afa52ea8d46a8226dcb2681e1f0a1b5f2653e959625da2a1cbffb509152b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-breeze"

RDEPENDS:${PN} += "metatheme-breeze-common"

inherit rpm
