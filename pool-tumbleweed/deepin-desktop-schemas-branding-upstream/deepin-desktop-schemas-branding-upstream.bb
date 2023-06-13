SUMMARY = "Upstream Branding of the Deepin Desktop Environment"
DESCRIPTION = "This package provides the upstream definition for Deepin Desktop GSchemas."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.11"

RPM_NAME = "deepin-desktop-schemas-branding-upstream-5.10.11-2.1.noarch.rpm"
RPM_HASH = "bfa0b6bfc725c9b3c23c3421174518869ec63f052d941b4690d10d6dd032963a4e2f9d2b14876664f153277fbfe23b1b10fe8f00d2c98473bc7ef879c89ed255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-desktop-schemas-branding \
deepin-desktop-schemas-branding-upstream"

RDEPENDS:${PN} += "deepin-desktop-schemas"

inherit rpm
