SUMMARY = "The GTK+ toolkit library (version 2) -- openSUSE theme configuration"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the openSUSE theme configuration for \
widgets and icon themes."
LICENSE = "BSD-3-Clause"

PV = "15.0"

RPM_NAME = "gtk2-branding-openSUSE-15.0-1.18.noarch.rpm"
RPM_HASH = "d36f4d11601fd76eef07d6764b73d579061892452d3788ace0869f4a3655109565b9028c87498bea172a1457a90f5cca576d65be411a71a579498017efdceedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gtk2-branding-openSUSE \
gtk2-branding \
gtk2-branding-openSUSE"

RDEPENDS:${PN} += "gtk2-metatheme-adwaita \
libgtk-2-0-0"

inherit rpm
