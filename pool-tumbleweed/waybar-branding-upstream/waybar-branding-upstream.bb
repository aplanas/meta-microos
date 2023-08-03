SUMMARY = "Upstream branding of waybar"
DESCRIPTION = "This package provides the upstream look and feel for sway."
LICENSE = "MIT"

PV = "0.9.20"

RPM_NAME = "waybar-branding-upstream-0.9.20-1.1.noarch.rpm"
RPM_HASH = "6d0f971479046ae74f2dabf929c6b5d1f3cbff8235010d797feb42e3c21cb830dc2190b441736ef9dcb383941b64310be46c8e654413ef6d418a4ef26c828e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-waybar-branding-upstream \
waybar-branding \
waybar-branding-upstream"

RDEPENDS:${PN} += "waybar"

inherit rpm
