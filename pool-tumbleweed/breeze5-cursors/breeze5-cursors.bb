SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze cursor theme."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "breeze5-cursors-5.27.6-1.1.noarch.rpm"
RPM_HASH = "0b399652353f20ccbfc6e3f20a082a7a78616b1c98f35912ed59257e8f9c7d077c8caaca67abae7306b6d29b9224373c64a9259857a9c8fb6b74c354531b6689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-cursors"

RDEPENDS:${PN} += ""

inherit rpm
