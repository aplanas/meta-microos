SUMMARY = "GNOME Terminal -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Terminal."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.1"

RPM_NAME = "gnome-shell-search-provider-gnome-terminal-3.48.1-1.1.noarch.rpm"
RPM_HASH = "4059c35b1d64738c41b0f21bdde1380e81f4567477de89980d8c700bd9707a6b16c34c28609e09456052c1bd083a0b6604106a8f5d7a2402eeecb9d488343534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-terminal"

RDEPENDS:${PN} += "gnome-terminal"

inherit rpm
