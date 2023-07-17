SUMMARY = "Upstream branding of sway"
DESCRIPTION = "This package provides the upstream look and feel for sway."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "sway-branding-upstream-1.8.1-3.1.noarch.rpm"
RPM_HASH = "0b73bcee8f47d1a6e0993ec78fb4abbd3009095aafff93be629efcc9c15ad6c4f4c5f580b95880517bbbe17650fb2d4a6d6a8364cfdf790c371f4c795845ce8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sway-branding-upstream \
sway-branding \
sway-branding-upstream"

RDEPENDS:${PN} += "sway"

inherit rpm
