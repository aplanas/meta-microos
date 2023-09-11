SUMMARY = "Matcha openbox themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the openbox themes."
LICENSE = "GPL-3.0-only"

PV = "20230403"

RPM_NAME = "openbox-theme-matcha-20230403-1.1.noarch.rpm"
RPM_HASH = "a9c1f558e9d942206656f4ae160e0e0f2fd9f1baecb266d3e8b1c0e51bb0d7b3a9d1eaa7a9db4a8b917d4f240bbdb693889653e08252400cf1d9be4dfbf0d5ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openbox-theme-matcha"

RDEPENDS:${PN} += "metatheme-matcha-common \
openbox"

inherit rpm
