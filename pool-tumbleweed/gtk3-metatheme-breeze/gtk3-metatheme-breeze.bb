SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 3 Support"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.5"

RPM_NAME = "gtk3-metatheme-breeze-5.27.5-1.1.noarch.rpm"
RPM_HASH = "a6e9ee3d709ab35987c84678de3e4ce64f107de88988dcc6f4ffa175cac82c2d2d31b0bce1f7dd68fc0736570e5bcaaa407ded2049004635ebbf26089014b4b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-breeze"
RDEPENDS:${PN} += "metatheme-breeze-common"

inherit rpm
