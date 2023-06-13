SUMMARY = "Arc GTK 4 Theme"
DESCRIPTION = "Arc is a flat theme with transparent elements. \
It supports MATE, GNOME, Budgie, Xfce, and Cinnamon. \
 \
This package contains the GTK 4 theme."
LICENSE = "GPL-3.0-or-later"

PV = "20221218"

RPM_NAME = "gtk4-metatheme-arc-20221218-1.1.noarch.rpm"
RPM_HASH = "cc01c3342bfdbfff52c1c40e02118da444e850358d1fed21f58f8e348dbbb68ec2192b900c4c101332b67ab4dd2007c2d8289aedf6050d46155185d4eb2c5d42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-arc"

RDEPENDS:${PN} += "gtk4 \
metatheme-arc-common"

inherit rpm
