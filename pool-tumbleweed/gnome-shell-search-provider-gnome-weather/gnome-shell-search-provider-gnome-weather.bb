SUMMARY = "GNOME Weather -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Weather."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-search-provider-gnome-weather-44.0-2.1.noarch.rpm"
RPM_HASH = "86ea49f4f7fd03a4a37275fd25cdbc77f24e3a0c7d36c24cc5c5ebb0d938bcee85aab238c0a18e6f00670f6451e9ba5e8e002a7dbf02aea8ac7aec1c4fa3852b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-weather"

RDEPENDS:${PN} += "gnome-weather"

inherit rpm
