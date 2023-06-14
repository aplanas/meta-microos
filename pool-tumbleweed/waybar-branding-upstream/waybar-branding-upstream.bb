SUMMARY = "Upstream branding of waybar"
DESCRIPTION = "This package provides the upstream look and feel for sway."
LICENSE = "MIT"

PV = "0.9.18"

RPM_NAME = "waybar-branding-upstream-0.9.18-1.1.noarch.rpm"
RPM_HASH = "5120d2bb79061a2ea6ec7ba20b2ed16e3a14432ea65e7b00cbd77119dd821381d45414cc1866ffe676b549e79babbd33b0a6dfbf5dd2fa86057230bab9cad21a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-waybar-branding-upstream \
waybar-branding \
waybar-branding-upstream"

RDEPENDS:${PN} += "waybar"

inherit rpm
