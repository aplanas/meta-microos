SUMMARY = "Header files for the GNUstep Objective-C runtime"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications with the GNUstep Objective-C runtime."
LICENSE = "MIT"

PV = "2.1"

RPM_NAME = "libobjc2-devel-2.1-2.4.aarch64.rpm"
RPM_HASH = "b7c0930b88608b108bdd73c487fb5080547b9874b2f8c886c55b6440c7f1064b2d636150edb8b61bb5998c842750558a1954b9ba414ab0e13e0914baef052141"

RPROVIDES:${PN} += "libobjc2-devel \
pkgconfig-libobjc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libobjc4-6"

inherit rpm
