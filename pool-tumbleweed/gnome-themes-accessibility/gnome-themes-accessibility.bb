SUMMARY = "Accessibility GNOME Themes"
DESCRIPTION = "This package contains high-contrast and low-contrast themes for GNOME."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28"

RPM_NAME = "gnome-themes-accessibility-3.28-1.20.noarch.rpm"
RPM_HASH = "f9b1d17333e8bdacbcf137b6b067e31771a9cc48ce6a1b25ff34665d18c5833df7102d43cd386f6dccca23a7b3da5d39d4e5317e5b5e9779655811ce0132ec47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-themes-accessibility"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
