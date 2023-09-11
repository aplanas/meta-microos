SUMMARY = "Matcha Xfwm4 themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the Xfwm4 themes."
LICENSE = "GPL-3.0-only"

PV = "20230403"

RPM_NAME = "xfwm4-theme-matcha-20230403-1.1.noarch.rpm"
RPM_HASH = "2285a2a24e1108073b3c0e2084bfcb2e3fadc4a4c36dd20f78393fd39a2bc6212c64ea6f222d350118623d04fc766bdc74d0bea0d5bd1c1310fe5a0050329aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfwm4-theme-matcha"

RDEPENDS:${PN} += "metatheme-matcha-common \
xfwm4"

inherit rpm
