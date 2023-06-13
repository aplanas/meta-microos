SUMMARY = "GNOME Characters -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Characters."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-search-provider-gnome-characters-44.0-2.1.noarch.rpm"
RPM_HASH = "212d9ab1d085ec9b04e1380c0be22b848ebc11a57708c3092f65495ceb009ac299f7052cea1577eed2b417fe8d24fa331f69640c51ed9091a606f9d08645a11c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-characters"

RDEPENDS:${PN} += "gnome-characters"

inherit rpm
