SUMMARY = "Themes for Kvantum engine"
DESCRIPTION = " \
This package provides extra themes for Kvantum engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "kvantum-themes-1.0.10-1.1.noarch.rpm"
RPM_HASH = "eb7379dbf7a1ccb57b13dfe63003275df74ffec895250f01bb74353f4c990fea2139d8e580fd0cd2138b2f82ad63f10d01d5ee17a9bae086ab842afcfcd0ed86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvantum-themes"

RDEPENDS:${PN} += "-kvantum-qt5 = 1.0.10 or kvantum-qt6 = 1.0.10"

inherit rpm
