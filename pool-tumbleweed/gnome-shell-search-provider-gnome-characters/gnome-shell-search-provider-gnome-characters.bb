SUMMARY = "GNOME Characters -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Characters."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-search-provider-gnome-characters-44.0-2.2.noarch.rpm"
RPM_HASH = "e64d4c079d597ae39f68cd1fdaf3576ec8a3134769a1ec0518db839c7d1f91520831bd2628ba94b8cf7fc4df09490511d1a36d3cc2b1c4c9d1d735f1d64d6431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-characters"

RDEPENDS:${PN} += "gnome-characters"

inherit rpm
