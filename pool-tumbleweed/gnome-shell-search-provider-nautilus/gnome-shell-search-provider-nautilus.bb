SUMMARY = "File Manager for the GNOME Desktop -- Search Provider for GNOME Shell"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Files (nautilus)"
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "gnome-shell-search-provider-nautilus-44.2-2.1.noarch.rpm"
RPM_HASH = "891d453f6f828124fa9c44db95a2182ae65164b64d5b8c619c5f4bdc41ac20aaefb86f7c73b18225eb6529788cf53caf9f68c677e8958db9d9078bde87c9d7b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-nautilus"

RDEPENDS:${PN} += "gnome-shell \
nautilus"

inherit rpm
