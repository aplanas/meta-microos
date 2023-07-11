SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the large (128x128 and larger) non-scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "oxygen5-icon-theme-large-5.107.0-1.1.noarch.rpm"
RPM_HASH = "a6a1e2e47ea52d33d967c7e39761160af304afd3f3d4ef4455656c15ba14dee143df9811bb9c76526cef7fe7cbb4805199cbf8cb8a4f0e2c157abd50ed2a6c2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme-large \
oxygen5-icon-theme-large"

RDEPENDS:${PN} += "oxygen5-icon-theme"

inherit rpm
