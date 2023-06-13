SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the non-scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "oxygen5-icon-theme-5.106.0-1.1.noarch.rpm"
RPM_HASH = "4cff296cd51719ca3b283d842ad8e217551891fab19ddf4e106502258d595daeb3d312fd48855299683ca11e95fcdda10d19aae1ceddfd1db102dcb6e9fa6e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme \
oxygen5-icon-theme"

RDEPENDS:${PN} += "hicolor-icon-theme"

inherit rpm
