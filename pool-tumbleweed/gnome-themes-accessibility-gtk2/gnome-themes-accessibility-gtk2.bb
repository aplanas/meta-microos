SUMMARY = "Accessibility GNOME Themes"
DESCRIPTION = "This package contains high-contrast and low-contrast themes for gtk2 applications."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28"

RPM_NAME = "gnome-themes-accessibility-gtk2-3.28-1.20.noarch.rpm"
RPM_HASH = "0167fe46b7b6356c5b07ed7e5a02bcf773952ac27d444404ec790c59503ddd418655cb9ac01958d3747a5b07ccdf9076419d2cb3d583a103c1ef7e4254cb1f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-themes-accessibility-gtk2"

RDEPENDS:${PN} += "gtk2-engine-hcengine"

inherit rpm
