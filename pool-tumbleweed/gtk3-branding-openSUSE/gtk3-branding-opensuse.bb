SUMMARY = "The GTK+ toolkit library (version 3) -- openSUSE theme configuration"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the openSUSE theme configuration for \
widgets and icon themes."
LICENSE = "BSD-3-Clause"

PV = "15.0"

RPM_NAME = "gtk3-branding-openSUSE-15.0-1.46.noarch.rpm"
RPM_HASH = "3b768d83abf749d4a7123041d1103efce2f7f5f778114a436803bda090479025213ab3ce7ade58ebeef72a0ab43bb02acbb03395c8eb2e9e884b18cc19d0256a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(gtk3-branding-openSUSE) \
gtk3-branding \
gtk3-branding-openSUSE"

RDEPENDS:${PN} += "gtk3-metatheme-adwaita \
libgtk-3-0"

inherit rpm
