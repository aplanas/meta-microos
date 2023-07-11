SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 3 Support"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.6"

RPM_NAME = "gtk3-metatheme-breeze-5.27.6-1.1.noarch.rpm"
RPM_HASH = "44b6bf68d6147afbf6c999425fe786879d22ecb1a76635fa1e1f0dcf54a41ed80253326ae8b5cb2502b868c64999c57579dc08359cace1b2428fe923e2c98b70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-breeze"

RDEPENDS:${PN} += "metatheme-breeze-common"

inherit rpm
