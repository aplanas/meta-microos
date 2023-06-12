SUMMARY = "Matcha Xfwm4 themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the Xfwm4 themes."
LICENSE = "GPL-3.0-only"

PV = "20221115"

RPM_NAME = "xfwm4-theme-matcha-20221115-1.1.noarch.rpm"
RPM_HASH = "80180d3a86c79d6f8ca225a04847071021d2d9ac7dbe0f4214fee5bbf86931744647a5e8d671d2d51936324ac2b8c5578dbff62489b86ac059fc5bc227c82fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfwm4-theme-matcha"
RDEPENDS:${PN} += "metatheme-matcha-common \
xfwm4"

inherit rpm
