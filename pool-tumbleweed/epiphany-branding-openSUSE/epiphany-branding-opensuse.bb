SUMMARY = "GNOME Web Browser -- openSUSE default bookmarks and user agent string"
DESCRIPTION = "Epiphany is a Web Browser for the GNOME Desktop. Its principles are \
simplicity and standards compliance. \
 \
This package provides the openSUSE default bookmarks and user \
agent string."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "epiphany-branding-openSUSE-42.1-8.51.noarch.rpm"
RPM_HASH = "0a1e6cc45b0956f6368b221b4c078921976889b27be11fe1739b1652414c07bb3e3103544339aa61576988edd43741747b6e8ceac6c6d55afbba9f003648d017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epiphany-branding \
epiphany-branding-openSUSE"

RDEPENDS:${PN} += "epiphany"

inherit rpm
