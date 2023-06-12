SUMMARY = "GNOME Web Browser -- Upstream default bookmarks and user agent string"
DESCRIPTION = "Epiphany is a Web Browser for the GNOME Desktop. Its principles are \
simplicity and standards compliance. \
 \
This package provides the upstream default bookmarks and user agent \
string."
LICENSE = "GPL-3.0-or-later"

PV = "44.3"

RPM_NAME = "epiphany-branding-upstream-44.3-1.1.noarch.rpm"
RPM_HASH = "8bed538c794a13cf0a37da90afb99b40608a2414c811b0015b4903cd51f614ed1d7e1d21ff80b9f885f7d6fd6f8a3385720e8482af092094a62da6a32639d13e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epiphany-branding \
epiphany-branding-upstream"
RDEPENDS:${PN} += "epiphany"

inherit rpm
