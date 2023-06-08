SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze cursor theme."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "breeze5-cursors-5.27.4-2.1.noarch.rpm"
RPM_HASH = "7be8486607d4bdb6b15db6e37590dfa96fa1779143b276de033a7aca27df51ae88e68f00edce4c192fd7fd4e669f658b7af66fbddfe01190540876d24a64eef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-cursors"
RDEPENDS:${PN} += ""

inherit rpm
