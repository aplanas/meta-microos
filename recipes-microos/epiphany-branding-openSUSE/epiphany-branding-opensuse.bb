SUMMARY = "GNOME Web Browser -- openSUSE default bookmarks and user agent string"
DESCRIPTION = "Epiphany is a Web Browser for the GNOME Desktop. Its principles are \
simplicity and standards compliance. \
 \
This package provides the openSUSE default bookmarks and user \
agent string."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "epiphany-branding-openSUSE-42.1-8.50.noarch.rpm"
RPM_HASH = "85688e3e39282cb483d9d48e82f940fb14c5a8e127e44377726ac42fc2a4c03c1f38c93f8b02c2cc9ce62d55ba1ed1ae9ccf534f17d55f01fdd19cf60863ec74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epiphany-branding epiphany-branding-openSUSE"
RDEPENDS:${PN} += "epiphany"

inherit rpm
