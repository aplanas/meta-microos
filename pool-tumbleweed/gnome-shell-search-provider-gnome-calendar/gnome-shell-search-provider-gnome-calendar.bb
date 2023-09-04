SUMMARY = "GNOME Shell search provider to return results from the GNOME Calendar"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Calendar."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-shell-search-provider-gnome-calendar-44.1-2.1.noarch.rpm"
RPM_HASH = "56982727028d5a64cecce3c8917a5d3a1eb01ab342d599ea37c9dd54c742f7f02e9a33654b2a7c00f7e8e7f4331967c83174c81e6e510c2ea3e7d0b113d2e44a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-calendar"

RDEPENDS:${PN} += "gnome-calendar"

inherit rpm
