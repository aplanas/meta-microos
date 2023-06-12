SUMMARY = "Crux Theme for GTK+ 2"
DESCRIPTION = "This package provides the Crux GTK+ 2 theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-crux-2.20.2-19.42.noarch.rpm"
RPM_HASH = "e8f95e81a8a572cbd8a38a3f29753d0e92d3684657030a0623879ec4b0fcb80e118662aeec3c7fe9330f77666381e202aad47675cc20da209f8f792e74fd98eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-crux"
RDEPENDS:${PN} += "gtk2-engine-crux"

inherit rpm
