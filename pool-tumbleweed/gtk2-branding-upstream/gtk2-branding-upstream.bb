SUMMARY = "Upstream theme configuration for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-branding-upstream-2.24.33-4.4.noarch.rpm"
RPM_HASH = "eedfbd1c3ce30e4504bba408d93efba831592cf6005cee2368762500d50c022361f6077d98b888767196c4574cf93b0d534e80174580284bb6a764d06beaa8ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gtk2-branding-upstream \
gtk2-branding \
gtk2-branding-upstream"

RDEPENDS:${PN} += "libgtk-2-0-0"

inherit rpm
