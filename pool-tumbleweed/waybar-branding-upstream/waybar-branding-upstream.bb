SUMMARY = "Upstream branding of waybar"
DESCRIPTION = "This package provides the upstream look and feel for sway."
LICENSE = "MIT"

PV = "0.9.19"

RPM_NAME = "waybar-branding-upstream-0.9.19-1.2.noarch.rpm"
RPM_HASH = "f27a27acddb37e04fbf0bf13b0bca1012949874701d0d20722ebe8f335580964bb32876bf8bd8a04b64596d08f3e7effcd12ad1ee88d0c36c296d8e660264aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-waybar-branding-upstream \
waybar-branding \
waybar-branding-upstream"

RDEPENDS:${PN} += "waybar"

inherit rpm
