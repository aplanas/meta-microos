SUMMARY = "The GTK+ toolkit library (version 3) -- openSUSE theme configuration"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the openSUSE theme configuration for \
widgets and icon themes."
LICENSE = "BSD-3-Clause"

PV = "15.0"

RPM_NAME = "gtk4-branding-openSUSE-15.0-2.23.noarch.rpm"
RPM_HASH = "93e619ced266035b43adc58162c49106704bb47478bdff6f0407db77b3ff873cb458965ecdaf8460478dd423b53d6c37c85c08ecb2c5fc568522e670cab8a478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-branding \
gtk4-branding-openSUSE"

RDEPENDS:${PN} += "libgtk-4-1"

inherit rpm
