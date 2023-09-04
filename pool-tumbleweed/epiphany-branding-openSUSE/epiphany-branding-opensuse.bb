SUMMARY = "GNOME Web Browser -- openSUSE default bookmarks and user agent string"
DESCRIPTION = "Epiphany is a Web Browser for the GNOME Desktop. Its principles are \
simplicity and standards compliance. \
 \
This package provides the openSUSE default bookmarks and user \
agent string."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "epiphany-branding-openSUSE-42.1-8.53.noarch.rpm"
RPM_HASH = "680d411fdce62e12f0730fa98f11db7e514d5abec15db90d14841ad1aba840e8cbc25d68f5e2a90a8d2dba27bb2e743b908365f343d8c7ff1ff5e73ce422c4a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epiphany-branding \
epiphany-branding-openSUSE"

RDEPENDS:${PN} += "epiphany"

inherit rpm
