SUMMARY = "GNOME Photos -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Photos."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-search-provider-gnome-photos-44.0-1.2.aarch64.rpm"
RPM_HASH = "deafcd9917322835b6ef1e0fb2fd8e664cf9085465cb8cffc408c33a59e5aa95e86f36632ac0c0ef35a2bffe59f180399d975031c4fcd28a7493928c6a5a3389"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-photos"

RDEPENDS:${PN} += "gnome-photos"

inherit rpm
