SUMMARY = "MATE Desktop Menu"
DESCRIPTION = "mate-menus contains the libmate-menu library, the layout \
configuration files for the MATE menu, as well as a simple menu \
editor. \
 \
The libmate-menu library implements the 'Desktop Menu Specification' \
from freedesktop.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "mate-menus-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "646fd985e7ef6a1cd665abad2481238c2b65d115cafd84d36e85a909b0bcb7f04613b967d1af1dd18504d182f238a466d7b677541fd37e92202e1294ba4b5c66"

RPROVIDES:${PN} += "config(mate-menus) \
mate-menus \
mate-menus(aarch-64)"
RDEPENDS:${PN} += "mate-menus-branding"

inherit rpm
