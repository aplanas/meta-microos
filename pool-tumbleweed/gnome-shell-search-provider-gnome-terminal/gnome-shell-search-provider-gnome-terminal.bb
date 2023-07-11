SUMMARY = "GNOME Terminal -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Terminal."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.1"

RPM_NAME = "gnome-shell-search-provider-gnome-terminal-3.48.1-1.2.noarch.rpm"
RPM_HASH = "b944a9f6cac7f3f5fead0deca1abbe6c8b94aa497f6df2dc2c08086f6a54b324f7206d8fa0d4a74dd54fee51a83efb7420716f79f849f926f8270ad05c9bb101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-terminal"

RDEPENDS:${PN} += "gnome-terminal"

inherit rpm
