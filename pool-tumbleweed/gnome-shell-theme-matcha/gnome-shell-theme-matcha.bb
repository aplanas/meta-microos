SUMMARY = "Matcha GNOME Shell themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the GNOME Shell themes."
LICENSE = "GPL-3.0-only"

PV = "20230403"

RPM_NAME = "gnome-shell-theme-matcha-20230403-1.1.noarch.rpm"
RPM_HASH = "712fcc2c8c29dcb83ad27a22433513223d945a7b13c8995578e05c1d35246e2ab81d62c60d45f44140fe1f8e675fa7f5ab950d981b971247e80a2d308006fd22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-theme-matcha"

RDEPENDS:${PN} += "gnome-shell \
metatheme-matcha-common"

inherit rpm
