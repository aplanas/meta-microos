SUMMARY = "Development files for the Qt 6 3DLogic library"
DESCRIPTION = "Development files for the Qt 6 3DLogic library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dlogic-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9fd723b015d159ef87f096f7138cecbe0614695407e2b2727966ad2a9b2df3b1f048885ed94cc0de4381003ae7eb756ef5ab7eb1ddc3b19edcf86b928e40e67d"

RPROVIDES:${PN} += "cmake-Qt63DLogic \
pkgconfig-Qt63DLogic \
qt6-3dlogic-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
libQt63DLogic6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
