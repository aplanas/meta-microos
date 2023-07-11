SUMMARY = "GNOME Clocks -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Clocks."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-search-provider-gnome-clocks-44.0-1.2.noarch.rpm"
RPM_HASH = "f249d45c515ec9324ec9225bdb2a903b794ec769b20e5e89d3582577a00ec9b82552f2ef86270235ec4b5066dbd993c1fb239748f988fdc4a0477d964be82265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-clocks"

RDEPENDS:${PN} += "gnome-clocks"

inherit rpm
