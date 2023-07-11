SUMMARY = "Header files for the GNOME Control Center"
DESCRIPTION = "The control center is GNOME's main interface for configuration of \
various aspects of your desktop."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-control-center-devel-44.3-1.1.noarch.rpm"
RPM_HASH = "e563911689fa17b7a0073d566169eaaa0e9c2a2d4695899c7fcd70785e6979d7b5e8363a1dcff531f33725680c8a735496484bc2c6db9e6df9b00cd88b89ac78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-devel \
pkgconfig-gnome-keybindings"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-control-center"

inherit rpm
