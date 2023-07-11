SUMMARY = "GNOME interface for gnupg -- Search Provider for GNOME Shell"
DESCRIPTION = "Seahorse is a GNOME interface for gnupg. It uses gpgme as the backend. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from seahorse."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "gnome-shell-search-provider-seahorse-43.0-3.6.noarch.rpm"
RPM_HASH = "ca19fcaced85f5cb79edd354ccb87f2035d0e251f444b00c9d8f55016de8f2ea907307f00b65ec4d554270f21c48cc9eadd12ed99a70da999dfcb0d032d05078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-seahorse"

RDEPENDS:${PN} += ""

inherit rpm
