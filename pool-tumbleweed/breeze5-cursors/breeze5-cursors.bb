SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze cursor theme."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "breeze5-cursors-5.27.7-1.1.noarch.rpm"
RPM_HASH = "09a2db445449d1c089c6403f50bcb65f416f80c2743894235cb8a5216e0ffed1b502899ead628b068263802498b95ed4be1506884d6c6f6378e5d5862455d977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-cursors"

RDEPENDS:${PN} += ""

inherit rpm
