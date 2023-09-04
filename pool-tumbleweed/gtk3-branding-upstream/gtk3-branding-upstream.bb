SUMMARY = "Upstream theme configuration for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the upstream theme configuration for widgets and \
icon themes."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-branding-upstream-3.24.38-2.1.noarch.rpm"
RPM_HASH = "5ae70c187f3db0a65b9a86dad647997ca70f4ccaf483cb4791dd96299c25efee1af0814222c30e229728dfb5888870605e6c8ee100e2f541f20a2095562d746f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gtk3-branding-upstream \
gtk3-branding \
gtk3-branding-upstream"

RDEPENDS:${PN} += "libgtk-3-0"

inherit rpm
