SUMMARY = "Upstream Branding of the Deepin Desktop Environment"
DESCRIPTION = "This package provides the upstream definition for Deepin Desktop GSchemas."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.11"

RPM_NAME = "deepin-desktop-schemas-branding-upstream-5.10.11-1.4.noarch.rpm"
RPM_HASH = "c7894d0c5b047394e7a76f998c07bc915a9a377f1bfdeffd9d570c158e1e83b3357ae12b3d2d421cb75ae45b71a9b7c51fcad7b1968d88b73262b26e02a17257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-desktop-schemas-branding deepin-desktop-schemas-branding-upstream"
RDEPENDS:${PN} += "deepin-desktop-schemas"

inherit rpm
