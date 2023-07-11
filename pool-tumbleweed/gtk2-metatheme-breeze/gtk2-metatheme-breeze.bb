SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 2 Support"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.6"

RPM_NAME = "gtk2-metatheme-breeze-5.27.6-1.1.noarch.rpm"
RPM_HASH = "d9f8927633400f8e6e6e51913f354cfe37f46031e8e8e4c344fbffbb9a16342a7f96ebdc08bb3d695f454e988d5ead10d5e764b631b26a06596f96eda003fcab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-breeze"

RDEPENDS:${PN} += "metatheme-breeze-common"

inherit rpm
