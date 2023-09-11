SUMMARY = "Matcha GTK+3 themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the GTK3+ themes."
LICENSE = "GPL-3.0-only"

PV = "20230403"

RPM_NAME = "gtk3-metatheme-matcha-20230403-1.1.noarch.rpm"
RPM_HASH = "87a86d168ccca66e7ca2ec2027b9d4b6013492bfac584e80f8842b680dd344eb19e82054abcf970367e236e21ecfa0b4c3d5983f8078006172c72e4a5b4fa58e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-matcha"

RDEPENDS:${PN} += "gtk3 \
metatheme-matcha-common"

inherit rpm
