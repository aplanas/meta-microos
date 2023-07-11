SUMMARY = "A recipe app for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "GNOME Recipes is an easy-to-use application that will help you to discover what to cook \
today, tomorrow, rest of the week and for your special occasions. \
 \
Recipes comes with a collection of recipes that have been collected by GNOME contributors \
from all over the world. It also lets you store your own recipes, and share them with your \
friends. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Recipes."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4"

RPM_NAME = "gnome-shell-search-provider-gnome-recipes-2.0.4-1.18.aarch64.rpm"
RPM_HASH = "2ae1180a83e9ce66ef0e506ebb524972e788ba71655d0e8c9375c3b60963d7c382d647ddc3dbee268b65ff2281e899ff476c05cb3ef8273bbdf571f65f964584"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-recipes"

RDEPENDS:${PN} += "gnome-recipes \
gnome-shell"

inherit rpm
