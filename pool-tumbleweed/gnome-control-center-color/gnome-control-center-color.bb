SUMMARY = "Configuration panel for color management"
DESCRIPTION = "This package provides the color management configuration panel for \
GNOME control center."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-control-center-color-44.3-1.1.noarch.rpm"
RPM_HASH = "8416a3169b550e88aab5989423a088aaebd0c379f4f4bb2759faed904c9b05e0e3c6805eec5cd80e0de247f41b022ee0e1d9c65cd12438a0ade5f6f7e9e6aae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-color"

RDEPENDS:${PN} += "colord \
gnome-color-manager \
gnome-control-center"

inherit rpm
