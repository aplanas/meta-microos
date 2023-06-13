SUMMARY = "Eolie Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from the Eolie Web browser."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.101"

RPM_NAME = "gnome-shell-search-provider-eolie-0.9.101-1.10.noarch.rpm"
RPM_HASH = "072c1c8704ad2997c0663db9796409c9228a27e8fe3f52384b299215adcf5ee0779745c8a2c2f235dbd168a6d408630bb6452bf0f4b9161290e015cd469dc561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-eolie"

RDEPENDS:${PN} += "/usr/bin/python3 \
eolie \
gnome-shell"

inherit rpm
