SUMMARY = "GNOME Terminal -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Terminal."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.2"

RPM_NAME = "gnome-shell-search-provider-gnome-terminal-3.48.2-1.1.noarch.rpm"
RPM_HASH = "9353b9a0204b11e769e444dae1993e91941eb387f61191795d87817f1a4ee78f3b0e2d3c7b1f0de73f61e2325c84b13a13e53599608a9ec1ed4f4b5197cd35c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-terminal"

RDEPENDS:${PN} += "gnome-terminal"

inherit rpm
