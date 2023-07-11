SUMMARY = "Upstream branding of waybar"
DESCRIPTION = "This package provides the upstream look and feel for sway."
LICENSE = "MIT"

PV = "0.9.19"

RPM_NAME = "waybar-branding-upstream-0.9.19-1.1.noarch.rpm"
RPM_HASH = "f9e90453d75647fba0b968e46da8e1f9b005c1c454de84c9e75255fcae9ee07247c3b59a06ff11822db3da27a26f5061215473d8609574d9bb6f642505d29c40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-waybar-branding-upstream \
waybar-branding \
waybar-branding-upstream"

RDEPENDS:${PN} += "waybar"

inherit rpm
