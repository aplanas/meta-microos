SUMMARY = "The GTK+ toolkit library (version 3) -- openSUSE theme configuration"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the openSUSE theme configuration for \
widgets and icon themes."
LICENSE = "BSD-3-Clause"

PV = "15.0"

RPM_NAME = "gtk4-branding-openSUSE-15.0-2.25.noarch.rpm"
RPM_HASH = "fa74562995f69f12fa20b4c062d4e69fe0afe39d90c4f1d1636ab5108dae44f382939b88bc6227abe60a86d1d2283c74b79b86536c5f3ddcc2ffae50573ef318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-branding \
gtk4-branding-openSUSE"

RDEPENDS:${PN} += "libgtk-4-1"

inherit rpm
