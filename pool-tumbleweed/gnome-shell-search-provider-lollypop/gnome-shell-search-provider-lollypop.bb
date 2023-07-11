SUMMARY = "GNOME music playing application - gnome-shell search provider"
DESCRIPTION = "Lollypop is a GNOME music playing application. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from lollypop."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.37"

RPM_NAME = "gnome-shell-search-provider-lollypop-1.4.37-1.3.noarch.rpm"
RPM_HASH = "63c33be5a1bfca3bc43fdf67fb7d996100e3676d632b5c4c150644c59f92670a0a8b98ad4d382868fb8e3f480096b5df9673870b1ac6a4d1544d0a1db10d186c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-lollypop"

RDEPENDS:${PN} += "/usr/bin/python3 \
gnome-shell \
lollypop"

inherit rpm
