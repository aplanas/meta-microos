SUMMARY = "GNOME Icon Theme Extras"
DESCRIPTION = "Extra GNOME icons for specific devices and file types."
LICENSE = "CC-BY-SA-3.0"

PV = "3.12.0"

RPM_NAME = "gnome-icon-theme-extras-3.12.0-3.19.noarch.rpm"
RPM_HASH = "944331e91b6bf82fdf201495dd918ad93615b271261e6faf502b42667cab5ff1750ca46b44c54c8876b875a4cf648a24e8c796c10a69ccc3e50d5bdd30af0f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-icon-theme-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-icon-theme"

inherit rpm
