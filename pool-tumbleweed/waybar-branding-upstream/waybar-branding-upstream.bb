SUMMARY = "Upstream branding of waybar"
DESCRIPTION = "This package provides the upstream look and feel for sway."
LICENSE = "MIT"

PV = "0.9.22"

RPM_NAME = "waybar-branding-upstream-0.9.22-1.1.noarch.rpm"
RPM_HASH = "5933653277810b9f1e5cad3bd568668b8bf5eefb5348cf476bf5b07c726b34f58d419a62113e8187a97d86d79d3678f79e5d522d208564a0c25878bb775c3341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-waybar-branding-upstream \
waybar-branding \
waybar-branding-upstream"

RDEPENDS:${PN} += "waybar"

inherit rpm
