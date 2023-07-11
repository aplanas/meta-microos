SUMMARY = "GNOME Web Browser -- Upstream default bookmarks and user agent string"
DESCRIPTION = "Epiphany is a Web Browser for the GNOME Desktop. Its principles are \
simplicity and standards compliance. \
 \
This package provides the upstream default bookmarks and user agent \
string."
LICENSE = "GPL-3.0-or-later"

PV = "44.5"

RPM_NAME = "epiphany-branding-upstream-44.5-1.1.noarch.rpm"
RPM_HASH = "c5d7482c60c08f3966fab256b1fe7e7e2d0e7793e1d0a6ad0d57836069aca2a6fdc283ab6ca33c37da9976fd249747bb3db5d00d761e929550ca56e0e0744255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epiphany-branding \
epiphany-branding-upstream"

RDEPENDS:${PN} += "epiphany"

inherit rpm
