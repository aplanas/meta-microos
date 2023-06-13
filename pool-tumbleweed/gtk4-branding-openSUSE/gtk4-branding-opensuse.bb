SUMMARY = "The GTK+ toolkit library (version 3) -- openSUSE theme configuration"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the openSUSE theme configuration for \
widgets and icon themes."
LICENSE = "BSD-3-Clause"

PV = "15.0"

RPM_NAME = "gtk4-branding-openSUSE-15.0-2.22.noarch.rpm"
RPM_HASH = "6118e354e92863c38ffb2eafc9cc7250490a03fd0abee76d76c128356dd13957f7443115f871a45615388e0db47ea857487537e1ddb15b7475185891c0e860d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-branding \
gtk4-branding-openSUSE"

RDEPENDS:${PN} += "libgtk-4-1"

inherit rpm
