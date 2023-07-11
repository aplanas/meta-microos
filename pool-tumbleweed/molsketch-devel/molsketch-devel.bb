SUMMARY = "Development files for molsketch"
DESCRIPTION = "2D molecular structures editor. \
 \
This package contains header files and libraries needed to develop \
application that use molsketch."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3"

RPM_NAME = "molsketch-devel-0.7.3-1.4.aarch64.rpm"
RPM_HASH = "fbba11cf0dd7e4367012a401d7bf49282026da477a54676eab69abc72667a6891dbe13d089a1d316f3d0a241eb07760058c2e48e7c7e38e3d42856be315681e2"

RPROVIDES:${PN} += "libmolsketch1 \
molsketch-devel"

RDEPENDS:${PN} += "libqt5-qttools"

inherit rpm
