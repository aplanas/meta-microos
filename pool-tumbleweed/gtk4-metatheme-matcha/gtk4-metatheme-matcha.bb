SUMMARY = "Matcha GTK+4 themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the GTK+4 themes."
LICENSE = "GPL-3.0-only"

PV = "20230403"

RPM_NAME = "gtk4-metatheme-matcha-20230403-1.1.noarch.rpm"
RPM_HASH = "82980181735e99fa63d201623526e6916fb35797e06414ab529e591ad728cb2b6faf3ed5c1fb60d1e7f63ae0d98515a68ec081237f36ff9e64c724042b6c4dd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-matcha"

RDEPENDS:${PN} += "gtk4 \
metatheme-matcha-common"

inherit rpm
