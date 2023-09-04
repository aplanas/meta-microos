SUMMARY = "Upstream theme configuration for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the upstream theme configuration for widgets and \
icon themes."
LICENSE = "LGPL-2.1-or-later"

PV = "4.12.0"

RPM_NAME = "gtk4-branding-upstream-4.12.0-2.1.noarch.rpm"
RPM_HASH = "298f916dda17383b49c4188b4737282cf6c208a64f8146c1561b57ebc53d6bf33f3ec286b940c93f7cfb93c75d42c6887fc11bf979dd2978591ade68fe5d4fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-branding \
gtk4-branding-upstream"

RDEPENDS:${PN} += "libgtk-4-1"

inherit rpm
