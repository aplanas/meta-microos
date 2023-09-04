SUMMARY = "Development files for molsketch"
DESCRIPTION = "2D molecular structures editor. \
 \
This package contains header files and libraries needed to develop \
application that use molsketch."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "molsketch-devel-0.8.0-1.1.noarch.rpm"
RPM_HASH = "7424fc4da7eb719145219e9977a9a51acf624182ce0fb90119af3c7e502508ca5bd5690df05b15b92ed090134425e9ebe7f61db9b39e3ffcd32e1f9f26020c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmolsketch1 \
molsketch-devel"

RDEPENDS:${PN} += "libqt5-qttools"

inherit rpm
