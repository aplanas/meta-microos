SUMMARY = "The GNOME Display Manager -- Upstream default configuration"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays. \
 \
This package provides the upstream default configuration for gdm."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-branding-upstream-44.1-1.1.noarch.rpm"
RPM_HASH = "198c89b71a81eb0bb7205f8c762972a712f0de0acb8ac0baa1314a8ce132b5cb4f88129c0188671d4e45dc455807f3b0a01d97172ce2a03536bc91c9eb198318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(gdm-branding-upstream) \
gdm-branding \
gdm-branding-upstream"
RDEPENDS:${PN} += "gdm"

inherit rpm
