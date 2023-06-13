SUMMARY = "Developer documentation for libadwaita"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the documentation for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.2"

RPM_NAME = "libadwaita-docs-1.3.2-1.1.noarch.rpm"
RPM_HASH = "0f0c78702b2d6e27d4c50a4dc4ec3e5ec49110261f151ba36e182be2b998f3ff64386734503e19c183c52d55e1e7b723e8c4d401fc730283e960dacf13c5418e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libadwaita-docs"

RDEPENDS:${PN} += ""

inherit rpm
