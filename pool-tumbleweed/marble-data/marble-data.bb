SUMMARY = "Generic map viewer: data"
DESCRIPTION = "Marble is a viewer of map data. This package contains its data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "marble-data-23.08.0-1.1.noarch.rpm"
RPM_HASH = "61cd09dc58c4f076a3b44a5122bd72c4069d4182026be2a7fc77c66ca68e08934f98a6e6c63ea83cdadc026639080e198a64924026e4aebeda29c73a68fd119f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marble-data \
marble5-data"

RDEPENDS:${PN} += "marble"

inherit rpm
