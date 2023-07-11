SUMMARY = "Eolie Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from the Eolie Web browser."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.101"

RPM_NAME = "gnome-shell-search-provider-eolie-0.9.101-1.11.noarch.rpm"
RPM_HASH = "fa28299444f458f96a318b6ac01c93b3cf274d622cb263976236e4b546d64aeb70a0d598949e956c00ef4a9ca230c1f40a5b17e8d2733216d41fad70c4a31c7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-eolie"

RDEPENDS:${PN} += "/usr/bin/python3 \
eolie \
gnome-shell"

inherit rpm
