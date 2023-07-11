SUMMARY = "Themes for Xfdashboard"
DESCRIPTION = "Additional themes for use with Xfdashboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "xfdashboard-themes-1.0.0-1.5.noarch.rpm"
RPM_HASH = "53b1c80b9ac307aac45e6de57edd8432e22c68a3a83c0eb7d1ad4f1cd43ac1731254fc4b98d6ee9fe2163bbe41129105cad39309f145b20bb56e7254670804ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfdashboard-themes"

RDEPENDS:${PN} += "xfdashboard"

inherit rpm
