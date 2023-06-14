SUMMARY = "Development files for molsketch"
DESCRIPTION = "2D molecular structures editor. \
 \
This package contains header files and libraries needed to develop \
application that use molsketch."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3"

RPM_NAME = "molsketch-devel-0.7.3-1.3.aarch64.rpm"
RPM_HASH = "a2a83ce0187d498b052680259fbfc21780b97dd98f140cceae4ecfe482e0ec0d163aba729b3f96b159abceee26c24679b6a8b1d406c64566ff428c1005022999"

RPROVIDES:${PN} += "libmolsketch1 \
molsketch-devel"

RDEPENDS:${PN} += "libqt5-qttools"

inherit rpm
