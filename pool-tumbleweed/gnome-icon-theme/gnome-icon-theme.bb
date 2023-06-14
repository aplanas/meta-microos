SUMMARY = "GNOME Icon Theme"
DESCRIPTION = "The default GNOME icon theme."
LICENSE = "LGPL-3.0-or-later | CC-BY-SA-3.0"

PV = "3.12.0"

RPM_NAME = "gnome-icon-theme-3.12.0-5.11.noarch.rpm"
RPM_HASH = "d458876218fa1981cc93aa423752e519d10785784a016b1a653b133c71ff53c1b61a7ff82fc25f712a0cd159a4b79a5a47a4c11b92333494b0e7f356f6221a45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-icon-theme \
gnome-icon-theme-devel \
pkgconfig-gnome-icon-theme"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
gtk3-tools"

inherit rpm
