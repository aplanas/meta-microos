SUMMARY = "openSUSE branding of waybar"
DESCRIPTION = "This package provides the openSUSE look and feel for waybar."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "waybar-branding-openSUSE-0.15.2-1.1.noarch.rpm"
RPM_HASH = "16e18acf6ed9f76af26c4fec6b7a8f07e43a3f07fbd8ba3366699fcd133743d2fd93d646544763a44dcfac27c44c99c4a93303baed1bbe8759b483d11b5827da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-waybar-branding-openSUSE \
waybar-branding \
waybar-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
