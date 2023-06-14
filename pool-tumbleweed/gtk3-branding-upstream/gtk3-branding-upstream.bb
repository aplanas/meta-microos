SUMMARY = "Upstream theme configuration for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the upstream theme configuration for widgets and \
icon themes."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-branding-upstream-3.24.38-1.1.noarch.rpm"
RPM_HASH = "b95b2696c5872fab6b0c50bbfa531162fde34156df4d2a419af1e3324493c48ed3b91e4fc79776c04bdf6707e99a0b29465a5db0415d9f2adb7bbf823974dba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gtk3-branding-upstream \
gtk3-branding \
gtk3-branding-upstream"

RDEPENDS:${PN} += "libgtk-3-0"

inherit rpm
