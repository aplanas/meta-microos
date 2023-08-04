SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 2 Support"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.7"

RPM_NAME = "gtk2-metatheme-breeze-5.27.7-1.1.noarch.rpm"
RPM_HASH = "1fd546eedbab3addf2cfd8e87ea7e2513078f9419bd65117b1efe5736d7fb1f1009707758e32b0e44e024f4ddd4c5fe165133b86539d40c9465833222772066a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-breeze"

RDEPENDS:${PN} += "metatheme-breeze-common"

inherit rpm
