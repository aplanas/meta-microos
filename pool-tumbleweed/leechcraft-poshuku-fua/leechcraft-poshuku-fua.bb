SUMMARY = "LeechCraft Poshuku module to change the user agent"
DESCRIPTION = "This package provides a fake user agent plugin for LeechCraft Poshuku \
for setting different User-Agent strings for different URLs. \
 \
Features: \
 * URLs are defined either by their substring or by regular expression. \
 * Several popular predefined user agents are present. \
 * Support for custom user-defined strings. \
 * Support for automatic insertion of current platform, language, \
etc. into the User-Agent string in arbitrary places."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-fua-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "3d5a3aaadc7b957d69052e157b300a2d60e9081cf24a70ef35e3484ff0b1377bde9ea8e1ed96026ae62451b8048a8c0647dd09201b427b8b6d2e2ffc0daaa719"

RPROVIDES:${PN} += "leechcraft-poshuku-fua \
libleechcraft-poshuku-fua.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
