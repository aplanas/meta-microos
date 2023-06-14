SUMMARY = "GNOME Photos -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Photos."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-search-provider-gnome-photos-44.0-1.1.aarch64.rpm"
RPM_HASH = "d7628fb33acf5faef5d0e677ae1c765d5e7757292ce8c8f8a20a99ee57ca5861893d2c2ade15168437f7296e0aee093d43ea9971bd7c8d53e439fb1fac2668e4"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-photos"

RDEPENDS:${PN} += "gnome-photos"

inherit rpm
