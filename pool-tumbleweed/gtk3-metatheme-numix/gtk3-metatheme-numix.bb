SUMMARY = "Numix GTK+3 Theme"
DESCRIPTION = "Numix is a modern flat theme with a combination of light and dark \
elements. It supports MATE, GNOME, Xfce, and Openbox. \
This package contains the GTK+3 theme."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.7.1617863126.0d6b4c8"

RPM_NAME = "gtk3-metatheme-numix-2.6.7.1617863126.0d6b4c8-2.6.noarch.rpm"
RPM_HASH = "0e29760cdd57fc1ff1f85dd8e167d374f89045984a87a7fd75dfd3d5e87bb6ba1c1cbba880bf58650dd2ac9c8c088750d939c65a7abba274259dd371f381e4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-numix"

RDEPENDS:${PN} += "gtk3 \
metatheme-numix-common"

inherit rpm
