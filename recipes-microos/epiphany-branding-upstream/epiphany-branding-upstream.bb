SUMMARY = "GNOME Web Browser -- Upstream default bookmarks and user agent string"
DESCRIPTION = "Epiphany is a Web Browser for the GNOME Desktop. Its principles are \
simplicity and standards compliance. \
 \
This package provides the upstream default bookmarks and user agent \
string."
LICENSE = "GPL-3.0-or-later"

PV = "44.2"

RPM_NAME = "epiphany-branding-upstream-44.2-1.1.noarch.rpm"
RPM_HASH = "f47bf74a7ce5915a98758acd810e93d087ad7af4d7560e3adc6d8713cb82367e4c85244bba1762d9b6f8f1a26c925d549bdda4e2b7de444169e225763f0a50b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epiphany-branding epiphany-branding-upstream"
RDEPENDS:${PN} += "epiphany"

inherit rpm
