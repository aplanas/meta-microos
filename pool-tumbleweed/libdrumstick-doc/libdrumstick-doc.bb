SUMMARY = "Development documentation package for the drumstick libraries"
DESCRIPTION = "This package contains the developer's documentation of the drumstick libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-doc-2.7.2-1.3.noarch.rpm"
RPM_HASH = "773f3ac83cb1a43eb0065eab21955a9d452f0d0791f5a064570e1fde0a21e18d27768a03da09cfc87b12835dd3d562080f7a91bbfad5dabfe49215429861bf0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdrumstick-doc"
RDEPENDS:${PN} += ""

inherit rpm
