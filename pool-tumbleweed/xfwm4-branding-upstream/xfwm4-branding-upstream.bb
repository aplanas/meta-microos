SUMMARY = "Upstream Branding of xfwm4"
DESCRIPTION = "This package provides the upstream look and feel for the xfwm4 window manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "xfwm4-branding-upstream-4.18.0-1.4.noarch.rpm"
RPM_HASH = "3a89260a19395fd3c4bb328c7b8719db89a37b4352e090f55ec015f318d347e817f7102f9d4f9bd65f9c4ea9eb54e6b44224477c940303508987547da3d009dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfwm4-branding-upstream \
xfwm4-branding \
xfwm4-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
