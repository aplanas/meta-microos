SUMMARY = "Wikipedia reader for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to return search \
results from wike."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.1"

RPM_NAME = "gnome-shell-search-provider-wike-2.0.1-1.1.noarch.rpm"
RPM_HASH = "3774f2bf34e5846c7941fcaa042630a5223218ebb8a34e1a4366fd547b2ab4bba9ae6036650d4625f580d6f71723fc4524daeb836082f26f7c7784a1e2987b2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-wike"

RDEPENDS:${PN} += "gnome-shell \
wike"

inherit rpm
