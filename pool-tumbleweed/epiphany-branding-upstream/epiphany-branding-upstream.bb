SUMMARY = "GNOME Web Browser -- Upstream default bookmarks and user agent string"
DESCRIPTION = "Epiphany is a Web Browser for the GNOME Desktop. Its principles are \
simplicity and standards compliance. \
 \
This package provides the upstream default bookmarks and user agent \
string."
LICENSE = "GPL-3.0-or-later"

PV = "44.6"

RPM_NAME = "epiphany-branding-upstream-44.6-1.1.noarch.rpm"
RPM_HASH = "10204515449d763fc2ac164109b79ae2b15e50943f1c41d16576c77905bc15ae211d11190f73073dd9b4af85c76b2078a8ea8892525a8433d00b2894774f07b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epiphany-branding \
epiphany-branding-upstream"

RDEPENDS:${PN} += "epiphany"

inherit rpm
